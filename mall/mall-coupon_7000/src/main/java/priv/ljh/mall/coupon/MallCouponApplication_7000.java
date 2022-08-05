package priv.ljh.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//@EnableFeignClients(basePackages = "priv.ljh.mall.member.feign")
public class MallCouponApplication_7000 {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication_7000.class, args);
    }

}
