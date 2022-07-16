package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author lijinghai
 * @ClassName: OrderFeignMain80
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/7/16 18:33
 * @Version: v1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}
