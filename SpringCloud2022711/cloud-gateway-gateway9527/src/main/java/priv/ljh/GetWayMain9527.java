package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author lijinghai
 * @ClassName:GetWayMain9527
 * @Email: lijinghailjh@163.com
 * @Description: GetWay主启动类
 * @Date: 2022/7/20 15:20
 * @Version: v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GetWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GetWayMain9527.class,args);
    }
}
