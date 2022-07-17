package priv.ljh.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author lijinghai
 * @ClassName: FeginConfig
 * @Email: lijinghailjh@163.com
 * @Description: OpenFeign日志增强
 * @Date: 2022/7/17 09:18
 * @Version: v1.0
 */
@Configuration
public class FeginConfig {
    @Bean
        Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
