package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:HuaweiiRouter
 * @Email: lijinghailjh@163.com
 * @Description: 华为路由器
 * @Date: 2022/6/18 21:08
 * @Version: v1.0
 */

public class HuaweiiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开华为wife");
    }

    @Override
    public void setting() {
        System.out.println("华为设置");
    }
}
