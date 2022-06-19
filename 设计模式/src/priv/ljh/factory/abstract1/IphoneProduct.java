package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:IphoneProduct
 * @Email: lijinghailjh@163.com
 * @Description: 手机产品接口
 * @Date: 2022/6/18 21:00
 * @Version: v1.0
 */
public interface IphoneProduct {
    void start();
    void shutdown();
    void callup();
    void sendSMS();
}
