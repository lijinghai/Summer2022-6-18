package priv.ljh.syn;

/**
 * @Author lijinghai
 * @ClassName:UnsafeBuyTicket
 * @Email: lijinghailjh@163.com
 * @Description: 不安全的买票
 * @Date: 2022/6/18 11:16
 * @Version: v1.0
 */

public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"苦逼的我").start();
        new Thread(buyTicket,"牛逼的你们").start();
        new Thread(buyTicket,"可恶的黄牛").start();
    }
}

class BuyTicket implements Runnable {

    /**
     * 票
     */
    private int ticketNums = 10;
    /**
     * 外部停止
     */
    boolean flag = true;

    @Override
    public void run() {
        // 买票
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void buy() throws InterruptedException {
        // 判断是否有票
        if(ticketNums<=0) {
            flag = false;
            return;
        }

        // 模拟延迟
        Thread.sleep(100);
        // 买票
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }

}
