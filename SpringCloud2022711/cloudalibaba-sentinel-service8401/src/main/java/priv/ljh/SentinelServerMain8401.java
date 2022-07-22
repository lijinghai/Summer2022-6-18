package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lijinghai
 * @ClassName:SentinelServerMain8401
 * @Email: lijinghailjh@163.com
 * @Description: Sentinel启动类
 * @Date: 2022/7/22 08:26
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServerMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServerMain8401.class,args);
    }
}
