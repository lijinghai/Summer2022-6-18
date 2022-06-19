package priv.ljh.adapter;

/**
 * @Author lijinghai
 * @ClassName: Computer
 * @Email: lijinghailjh@163.com
 * @Description: 客户端类
 * @Date: 2022/6/19 10:35
 * @Version: v1.0
 */

public class Computer {
    public void net(NetToUSB adapter) {
        /**
         * 找一个转接头
         */
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        /**
         * 电脑
         * 适配器
         * 网线
         */
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter();
        computer.net(adapter);
    }
}
