package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:Client
 * @Email: lijinghailjh@163.com
 * @Description:
 * @Date: 2022/6/18 21:18
 * @Version: v1.0
 */

public class Client {
    public static void main(String[] args) {
        System.out.println("====小米====");
        /**
         * 小米
         */
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        IphoneProduct iphoneProduct = xiaoMiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();
        iphoneProduct.shutdown();
        iphoneProduct.start();

    }
}
