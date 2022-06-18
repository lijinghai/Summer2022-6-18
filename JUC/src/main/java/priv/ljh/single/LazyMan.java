package priv.ljh.single;

/**
 * @Author lijinghai
 * @ClassName:LazyMan
 * @Email: lijinghailjh@163.com
 * @Description: 懒汉式
 * @Date: 2022/6/16 13:41
 * @Version: v1.0
 */

public class LazyMan {
    private LazyMan() {
        System.out.println(Thread.currentThread().getName() + "ok");
    }

    private volatile static LazyMan lazyMan;

    /**
     * 双重检测
     * @return
     */
    public static LazyMan getInstance() {
        //加锁
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    // 不是原子性操作
                    lazyMan = new LazyMan();
                    /**
                     * 1.分配内存空间
                     * 2.执行构造方法，初始化方法
                     * 3.把对象指向这个空间
                     */
                }
            }
        }
        return lazyMan;
    }

    /**
     * 多线程并发
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyMan.getInstance();
            }).start();
        }
    }
}
