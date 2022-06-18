package priv.ljh.factory.simple;

/**
 * @Author lijinghai
 * @ClassName:CarFactory
 * @Email: lijinghailjh@163.com
 * @Description: 车工厂
 * @Date: 2022/6/18 18:40
 * @Version: v1.0
 */

public class CarFactory {
    public static Car getCar(String car) {
        if(car.equals("五菱")) {
            return new WuLing();
        }else if (car.equals("特斯拉")) {
            return new Tesla();
        }else {
            return null;
        }
    }
}
