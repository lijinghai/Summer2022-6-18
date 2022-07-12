package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lijinghai
 * @ClassName: PaymentMain8001
 * @Email: lijinghailjh@163.com
 * @Description: 主启动类
 * @Date: 2022/7/11 19:14
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
