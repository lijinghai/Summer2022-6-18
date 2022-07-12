package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author lijinghai
 * @ClassName: EurekaMain7001
 * @Email: lijinghailjh@163.com
 * @Description: Eureka主启动类
 * @Date: 2022/7/12 16:50
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
