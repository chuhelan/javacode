package abc.demo2;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/30 9:38
 */

/**
 * 跟第一种区别：
 * 1.target类可继承自其他类
 * 2.一个target对象，可被多个线程调用
 */

public class RunThread implements Runnable {
    @Override
    public void run() {
        int i = 100;
        while (i > 0) {
            System.out.println(Thread.currentThread().getName() + ",i=" + i--);
        }
    }

    public static void main(String[] args) {
        RunThread runThread = new RunThread();
        new Thread(runThread).start();
    }

}
