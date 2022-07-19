package priv.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author lijinghai
 * @ClassName:HystrixDashboard
 * @Email: lijinghailjh@163.com
 * @Description: HystrixDashboard启动类
 * @Date: 2022/7/19 15:18
 * @Version: v1.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard9001.class,args);
    }
}
