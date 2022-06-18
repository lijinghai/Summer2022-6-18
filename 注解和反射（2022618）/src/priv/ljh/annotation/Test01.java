package priv.ljh.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lijinghai
 * @ClassName:Test01
 * @Email: lijinghailjh@163.com
 * @Description: 什么是注解
 * @Date: 2022/6/18 14:34
 * @Version: v1.0
 */

public class Test01 extends Object{
    /**
     * @Override 重写
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList();
    }

}
