package priv.ljh.factory.method;

/**
 * @Author lijinghai
 * @ClassName:TeslaFactory
 * @Email: lijinghailjh@163.com
 * @Description: 特斯拉工厂
 * @Date: 2022/6/18 20:36
 * @Version: v1.0
 */

public class TeslaFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
