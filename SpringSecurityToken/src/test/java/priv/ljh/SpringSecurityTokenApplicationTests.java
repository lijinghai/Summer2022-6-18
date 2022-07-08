package priv.ljh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import priv.ljh.entity.User;
import priv.ljh.mapper.MenuMapper;
import priv.ljh.mapper.UserMapper;

import java.util.List;

@SpringBootTest
class SpringSecurityTokenApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void testBCryptPasswordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("1015");
        String encode2 = bCryptPasswordEncoder.encode("1015");
        System.out.println(encode);
        System.out.println(encode2);

        System.out.println(passwordEncoder.matches("1015", "$2a$10$5kop3cbRvlCInpWBWpIzbe6EXlXa3uHqLU2OyXQ./aIb8tttTtRR2"));

        System.out.println(passwordEncoder.
                matches("1234",
                        "$2a$10$npv5JSeFR6/wLz8BBMmSBOMb8byg2eyfK4/vvoBk3RKtTLBhIhcpy"));

    }

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void testSelectPermsByUserId(){
        List<String> list = menuMapper.selectPermsByUserId(2L);
        System.out.println(list);
    }



}
