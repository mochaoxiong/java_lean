package com.mochaoxiong.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


//自定义的全局过滤器：判断是否登录和访问权限
@Component //交给spring容器
public class MyGlobalFilter implements GlobalFilter, Ordered {
    //处理业务逻辑的地方
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //接收请求并判断是否有参数?token=123（有就相当于登录，模拟）
        //有就放行，没有就返回错误
        ServerHttpRequest request = exchange.getRequest();
        ServerHttpResponse response = exchange.getResponse();
        String token = request.getQueryParams().getFirst("token");
        //注意token可能为空，如果是token.equals 空值时会报错
        if ("123".equals(token)) {
            //已登录（有token且为123）则放行
            return chain.filter(exchange);
        }
        else {
            //否则，则返回401错误
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            //表示完成了请求
            return response.setComplete();
        }
    }
    @Override
    public int getOrder() {
        //返回值越低，越先执行（优先级高）
        return 0;
    }
}
