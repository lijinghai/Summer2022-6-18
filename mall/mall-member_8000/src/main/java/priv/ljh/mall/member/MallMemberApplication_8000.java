package priv.ljh.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "priv.ljh.mall.member.feign")
public class MallMemberApplication_8000 {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication_8000.class, args);
    }

}
