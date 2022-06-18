package priv.ljh.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author lijinghai
 * @ClassName:Test03
 * @Email: lijinghailjh@163.com
 * @Description: 自定义注解
 * @Date: 2022/6/18 14:53
 * @Version: v1.0
 */

public class Test03 {
    @MyAnnotation2(name = "lijinghai",schools = "清华")
    public void test() {

    }

    @Myannotation3("lijinghai")
    public void test2() {

    }
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    /**
     * 注解的参数： 参数类型 + 参数名（）;
     * @return
     */
    String name() default "";

    int age() default 0;
    int id() default -1;
    String[] schools() default {"清华"};
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation3{
    String value();
}
