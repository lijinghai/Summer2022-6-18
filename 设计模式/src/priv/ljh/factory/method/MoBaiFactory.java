package priv.ljh.factory.method;

/**
 * @Author lijinghai
 * @ClassName:MoBaiFactory
 * @Email: lijinghailjh@163.com
 * @Description: 摩拜
 * @Date: 2022/6/18 20:40
 * @Version: v1.0
 */

public class MoBaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
