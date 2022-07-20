package priv.ljh.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lijinghai
 * @ClassName:GetWatConfig
 * @Email: lijinghailjh@163.com
 * @Description: getWay配置类
 * 浏览器输入http://localhost:9527/guonei，返回http://news.baidu.com/guonei相同的页面。
 * @Date: 2022/7/20 15:35
 * @Version: v1.0
 */
@Configuration
public class GetWatConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();

        return routes.build();
    }

}
