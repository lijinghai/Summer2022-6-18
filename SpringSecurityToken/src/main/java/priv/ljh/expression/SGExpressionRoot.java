package priv.ljh.expression;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import priv.ljh.entity.LoginUser;

import java.util.List;

/**
 * @Author lijinghai
 * @ClassName: SGExpressionRoot
 * @Email: lijinghailjh@163.com
 * @Description: 自定义权限
 * @Date: 2022/7/7 16:55
 * @Version: v1.0
 */
@Component("ex")
public class SGExpressionRoot {

    public boolean hasAuthority(String authority){
        //获取当前用户的权限
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        List<String> permissions = loginUser.getPermissions();
        //判断用户权限集合中是否存在authority
        return permissions.contains(authority);
    }
}
