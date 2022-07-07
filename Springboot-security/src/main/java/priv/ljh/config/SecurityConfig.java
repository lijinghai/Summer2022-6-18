package priv.ljh.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Author lijinghai
 * @ClassName: SecurityConfig
 * @Email: lijinghailjh@163.com
 * @Description: security配日类
 * @Date: 2022/6/24 13:11
 * @Version: v1.0
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // 授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/h1/**").hasRole("vip1");

        // 没有权限跳到login
        http.formLogin();

        // 注销
        http.logout().logoutUrl("/");
    }


    // 认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("lijinghai").password(new BCryptPasswordEncoder().encode("12345")).roles("vip1","vip2")
                .and()
                .withUser("lijinghai").password("12345").roles("vip1","vip2");
    }
}
