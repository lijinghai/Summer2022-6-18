package priv.ljh.annotation;

import java.lang.annotation.*;

/**
 * @Author lijinghai
 * @ClassName:Test02
 * @Email: lijinghailjh@163.com
 * @Description: 测试元注解
 * @Date: 2022/6/18 14:45
 * @Version: v1.0
 */
@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test() {

    }
}


/**
 * 定义一个注解
 * Target 表示注解可以作用在哪个上面
 */
@Target(value = {ElementType.METHOD,ElementType.TYPE})
/**
 * Retention 表示我们的注解在哪还有效
 */
@Retention(value = RetentionPolicy.RUNTIME)
/**
 * Documented 表示是否将我们的注解生成在javadoc中
 */
@Documented
@interface MyAnnotation{

}