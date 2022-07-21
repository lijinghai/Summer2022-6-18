package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lijinghai
 * @ClassName:PayMentMain9001
 * @Email: lijinghailjh@163.com
 * @Description: alibaba服务提供者
 * @Date: 2022/7/21 10:49
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PayMentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain9001.class,args);
    }
}
