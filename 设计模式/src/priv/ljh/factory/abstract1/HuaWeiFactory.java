package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:HuaWeiFactory
 * @Email: lijinghailjh@163.com
 * @Description: 华为工厂
 * @Date: 2022/6/18 21:16
 * @Version: v1.0
 */

public class HuaWeiFactory implements IProductFactory{
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiIphone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaweiiRouter();
    }
}
