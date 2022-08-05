//package priv.ljh.config;
//
//
//import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.BlockRequestHandler;
//import com.alibaba.csp.sentinel.adapter.gateway.sc.callback.GatewayCallbackManager;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import org.springframework.web.server.ServerWebExchange;
//import reactor.core.publisher.Mono;
//
///**
// * @Description: 自定义网关限流返回
// */
//@Component
//public class SentinelGatewayConfig {
//
//    // TODO 响应式编程
//    public SentinelGatewayConfig() {
//        GatewayCallbackManager.setBlockHandler(new BlockRequestHandler(){
//            // 网关限流了请求，就会调用此回调
//            @Override
//            public Mono<ServerResponse> handleRequest(ServerWebExchange serverWebExchange, Throwable throwable) {
//                R error = R.error(BizCodeEnume.TO_MANY_REQUEST.getCode(), BizCodeEnume.TO_MANY_REQUEST.getMsg());
//                String errJson = JSON.toJSONString(error);
//                return ServerResponse.ok().body(Mono.just(errJson), String.class);
//            }
//        });
//    }
//}
