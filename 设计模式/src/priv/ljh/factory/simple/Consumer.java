package priv.ljh.factory.simple;

/**
 * @Author lijinghai
 * @ClassName:Consumer
 * @Email: lijinghailjh@163.com
 * @Description: 消费者
 * @Date: 2022/6/18 18:38
 * @Version: v1.0
 */

public class Consumer {
    public static void main(String[] args) {
        //接口，所有的实现类
//        Car car = new WuLing();
//        Car car1 = new Tesla();
//        car.name();
//        car1.name();

        // 使用工厂创建
        Car car = CarFactory.getCar("五菱");
        car.name();
    }
}
