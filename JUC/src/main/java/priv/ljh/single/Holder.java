package priv.ljh.single;

/**
 * @Author lijinghai
 * @ClassName:Holder
 * @Email: lijinghailjh@163.com
 * @Description: 静态内部类
 * @Date: 2022/6/18 17:41
 * @Version: v1.0
 */

public class Holder {
    private Holder() {

    }

    public static Holder getInstance() {
        return InnerClass.HOLDER;
    }

    public static class InnerClass {
        private static final Holder HOLDER = new Holder();
    }
}
