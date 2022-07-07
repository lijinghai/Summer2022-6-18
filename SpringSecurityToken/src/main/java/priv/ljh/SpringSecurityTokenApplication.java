package priv.ljh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("priv.ljh.mapper")
public class SpringSecurityTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityTokenApplication.class, args);
    }

}
