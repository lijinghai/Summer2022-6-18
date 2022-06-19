package priv.ljh.factory.prototype.demo01;

import java.util.Date;

/**
 * @Author lijinghai
 * @ClassName: BiliBili
 * @Email: lijinghailjh@163.com
 * @Description: 客户端：实现克隆
 * @Date: 2022/6/19 10:13
 * @Version: v1.0
 */

public class BiliBili {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * 原型对象
         */
        Date date = new Date();
        Video lijinghai = new Video("lijinghai", date);
        System.out.println("v1"+lijinghai);
        System.out.println("v1=hash"+lijinghai.hashCode());

        /**
         * v1克隆v2
         */
        Video clone = (Video) lijinghai.clone();
        System.out.println(clone);
        System.out.println(clone.hashCode());

    }
}
