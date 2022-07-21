package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author lijinghai
 * @ClassName:NacosConfigClientMain3377
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/7/21 11:49
 * @Version: v1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class,args);
    }
}
