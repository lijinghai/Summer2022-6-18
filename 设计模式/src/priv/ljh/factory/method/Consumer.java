package priv.ljh.factory.method;

import priv.ljh.factory.simple.CarFactory;

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
        Car car = new WUlingFactory().getCar();
        Car car1 = new TeslaFactory().getCar();
        Car car2 = new MoBaiFactory().getCar();

        car.name();
        car1.name();
        car2.name();
    }
}
