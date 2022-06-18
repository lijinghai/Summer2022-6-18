package priv.ljh.single;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author lijinghai
 * @ClassName:EnumSingle
 * @Email: lijinghailjh@163.com
 * @Description: 枚举本身也是一个Class类
 * @Date: 2022/6/18 17:55
 * @Version: v1.0
 */
public enum EnumSingle {
    INSTANCE;
    public EnumSingle getInstance() {
        return INSTANCE;
    }
}


class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSingle instance1 = EnumSingle.INSTANCE;
        Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(null);
        declaredConstructor.setAccessible(true);
        EnumSingle instance2 = declaredConstructor.newInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}