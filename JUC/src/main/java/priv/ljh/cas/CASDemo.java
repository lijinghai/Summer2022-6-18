package priv.ljh.cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author lijinghai
 * @ClassName:CASDemo
 * @Email: lijinghailjh@163.com
 * @Description: cas
 * @Date: 2022/6/18 18:07
 * @Version: v1.0
 */

public class CASDemo {

    public static void main(String[] args) {
      AtomicInteger atomicInteger = new AtomicInteger(2020);
      atomicInteger.compareAndSet(2020,2021);
        System.out.println(atomicInteger.get());

        atomicInteger.compareAndSet(2020,2021);
        System.out.println(atomicInteger.get());
    }
}
