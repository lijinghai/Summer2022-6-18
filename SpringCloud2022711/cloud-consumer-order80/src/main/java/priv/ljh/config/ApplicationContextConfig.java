package priv.ljh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author lijinghai
 * @ClassName: ApplicationContextConfig
 * @Email: lijinghailjh@163.com
 * @Description: 配置类：
 * @Date: 2022/7/12 15:41
 * @Version: v1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

/**
 * applicationContext.xml <bean id=" " class=" "></bean>
 */
