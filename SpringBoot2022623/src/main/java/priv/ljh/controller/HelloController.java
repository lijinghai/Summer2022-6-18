package priv.ljh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lijinghai
 * @ClassName: HelloController
 * @Email: lijinghailjh@163.com
 * @Description: helloController
 * @Date: 2022/6/23 15:39
 * @Version: v1.0
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
