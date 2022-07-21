package priv.ljh;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lijinghai
 * @ClassName:OrderNacosMain83
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/7/21 11:04
 * @Version: v1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderNacosMain83 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain83.class,args);

    }
}
