package abc.Climb;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/30 10:41
 */

import java.util.Random;

/**
 * 使用多线程，模拟多人爬山，要求如下：
 * 随机设置每个人爬完100米所用的时间，每爬完100米则显示：xxx 爬完100米，总路程为1000，当一个人爬到终点，就会给出相应提示： xxx达到终点。
 */

public class Climb extends Thread {
    int time;
    String name;
    int mountain_height = 1000;
    boolean flag = false;
    int hundred_num;


    public Climb(int time) {
        super();
        this.time = time;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (!flag) {
            mountain_height -= 100;
            System.out.println(name + "爬了" + (hundred_num + 1) + "00米,还剩" + mountain_height + "米!");
            hundred_num++;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (mountain_height <= 0) {
                System.out.println("---------------恭喜" + name + "爬到了终点！---------------");
                break;
            }
        }
    }
}

class ClimbTest {
    public static void main(String[] args) {

        Climb climber1 = new Climb(200);
        Climb climber2 = new Climb(500);
        Climb climber3 = new Climb(600);
        Climb climber4 = new Climb(800);

        climber1.setName("张三");
        climber2.setName("李四");
        climber3.setName("王五");
        climber4.setName("赵六");

        climber1.start();
        climber2.start();
        climber3.start();
        climber4.start();
    }
}
