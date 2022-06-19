package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:IProductFatory
 * @Email: lijinghailjh@163.com
 * @Description: 抽象工厂
 * @Date: 2022/6/18 21:13
 * @Version: v1.0
 */

public interface IProductFactory {
    /**
     * 生产手机
     */
    IphoneProduct iphoneProduct();

    /**
     * 生产路由器
     */
    IRouterProduct routerProduct();

}
