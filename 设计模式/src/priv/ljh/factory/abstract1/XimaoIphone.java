package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:XimaoIphone
 * @Email: lijinghailjh@163.com
 * @Description: 小米手机
 * @Date: 2022/6/18 21:03
 * @Version: v1.0
 */

public class XimaoIphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启小米手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米手机");
    }

    @Override
    public void callup() {
        System.out.println("小米打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米发短信");
    }
}
