package priv.ljh.adapter;

/**
 * @Author lijinghai
 * @ClassName: Adapter
 * @Email: lijinghailjh@163.com
 * @Description: 适配器
 * @Date: 2022/6/19 10:37
 * @Version: v1.0
 */

public class Adapter extends Adaptee implements NetToUSB{

    @Override
    public void handleRequest() {
        super.request();
    }
}
