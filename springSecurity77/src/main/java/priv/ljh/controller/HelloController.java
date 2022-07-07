package priv.ljh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lijinghai
 * @ClassName: HelloController
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/7/7 16:55
 * @Version: v1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
