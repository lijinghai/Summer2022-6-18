package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:HuaweiIphone
 * @Email: lijinghailjh@163.com
 * @Description: 华为手机
 * @Date: 2022/6/18 21:04
 * @Version: v1.0
 */

public class HuaweiIphone implements IphoneProduct{
    @Override
    public void start() {
        System.out.println("开启华为手机");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为手机");
    }

    @Override
    public void callup() {
        System.out.println("华为打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为发短信");
    }
}
