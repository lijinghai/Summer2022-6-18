package priv.ljh.single;

/**
 * @Author lijinghai
 * @ClassName:Hungry
 * @Email: lijinghailjh@163.com
 * @Description: 饿汉式
 * @Date: 2022/6/16 11:31
 * @Version: v1.0
 */

public class Hungry {

    /**
     * 可能会浪费空间
     */
    private byte[] data1 = new byte[1024*1024];
    private byte[] data2 = new byte[1024*1024];
    private byte[] data3 = new byte[1024*1024];
    private byte[] data4 = new byte[1024*1024];

    private Hungry() {

    }

    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }

}
