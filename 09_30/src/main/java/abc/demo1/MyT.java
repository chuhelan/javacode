package abc.demo1;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/30 9:26
 */
public class MyT extends Thread {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i--);
        }
    }

    public static void main(String[] args) {
        MyT t = new MyT();
        t.start();
        System.out.println("..............................");
    }
}
