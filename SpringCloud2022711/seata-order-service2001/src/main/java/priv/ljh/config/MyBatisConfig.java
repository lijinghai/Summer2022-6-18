package priv.ljh.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"priv.ljh.dao"})
public class MyBatisConfig {
}
