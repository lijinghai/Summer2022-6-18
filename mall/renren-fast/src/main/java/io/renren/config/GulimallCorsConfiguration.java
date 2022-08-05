package io.renren.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GulimallCorsConfiguration {
 
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //跨域请求暴露的字段
        corsConfiguration.addAllowedHeader("*");
        //支持哪些方法跨域
        corsConfiguration.addAllowedMethod("*");
        //支持哪些来源的请求跨域
        corsConfiguration.addAllowedOrigin("*");
        //跨域请求默认不包含cookie，设置为true可以包含 cookie
        corsConfiguration.setAllowCredentials(true);
 
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }
}