package com.chuhelan.day_10_05;

import java.util.Random;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/10/5 13:34
 */
public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        final int sum = 1000;
        for (int i = 1; i < 101; i++) {
            new Thread(() -> {
                int speed = 100 + r.nextInt(100);
                int s = sum;
                while (s > 0) {
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException e) {

                    }
                    s -= 100;
                    System.out.println(Thread.currentThread().getName() + "爬完100米,速度为" + speed);
                }
                System.out.println("=================" + Thread.currentThread().getName() + "到达终点！=================");
            }, i + "号嘉宾").start();
        }
    }
}
