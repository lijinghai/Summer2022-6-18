package priv.ljh.factory.simple;

/**
 * @Author lijinghai
 * @ClassName:Tesla
 * @Email: lijinghailjh@163.com
 * @Description: 特斯拉
 * @Date: 2022/6/18 18:37
 * @Version: v1.0
 */

public class Tesla implements Car{
    @Override
    public void name() {
        System.out.println("特斯拉");
    }
}
