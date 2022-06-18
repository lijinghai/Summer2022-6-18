package priv.ljh.factory.method;

/**
 * @Author lijinghai
 * @ClassName:MoBai
 * @Email: lijinghailjh@163.com
 * @Description: 摩拜
 * @Date: 2022/6/18 20:39
 * @Version: v1.0
 */

public class MoBai implements Car{
    @Override
    public void name() {
        System.out.println("摩拜单车");
    }
}
