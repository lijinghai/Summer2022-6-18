package priv.ljh.service;


import priv.ljh.entity.User;
import priv.ljh.utils.ResponseResult.ResponseResult;

/**
 * @Author lijinghai
 * @ClassName: LoginService
 * @Email: lijinghailjh@163.com
 * @Description: 登录
 * @Date: 2022/7/8 13:35
 * @Version: v1.0
 */
public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
