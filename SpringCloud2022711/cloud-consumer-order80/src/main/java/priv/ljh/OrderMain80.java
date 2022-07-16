package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import priv.myRule.MySelfRule;

/**
 * @Author lijinghai
 * @ClassName: OrderMain80
 * @Email: lijinghailjh@163.com
 * @Description: 客户端消费者主启动类
 * @Date: 2022/7/12 15:33
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
