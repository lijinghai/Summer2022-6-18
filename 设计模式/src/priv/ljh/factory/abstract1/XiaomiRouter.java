package priv.ljh.factory.abstract1;

/**
 * @Author lijinghai
 * @ClassName:XiaomiRouter
 * @Email: lijinghailjh@163.com
 * @Description: 小米路由器
 * @Date: 2022/6/18 21:06
 * @Version: v1.0
 */

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开小米wife");
    }

    @Override
    public void setting() {
        System.out.println("小米设置");
    }
}
