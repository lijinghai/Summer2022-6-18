package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:XiaoMiFactory
 * @Email: lijinghailjh@163.com
 * @Description: 小米工厂
 * @Date: 2022/6/18 21:15
 * @Version: v1.0
 */

public class XiaoMiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new XimaoIphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new XiaomiRouter();
    }
}
