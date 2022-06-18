package priv.ljh.factory.method;

/**
 * @Author lijinghai
 * @ClassName:WUlingFactory
 * @Email: lijinghailjh@163.com
 * @Description: 五菱工厂
 * @Date: 2022/6/18 20:37
 * @Version: v1.0
 */

public class WUlingFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
