package abc.demo3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author chuhelan
 * @version 1.0
 * @date 2021/9/30 10:17
 */

/**
 * 相对于前两种，有连个有点
 * 1.可获取任务执行的结果
 * 2.可获取任务执行过程中抛出的异常
 */

public class CallThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            throw new RuntimeException("call able 异常");
        }
        return null;
    }

    public static void main(String[] args) {
        CallThread c = new CallThread();
        FutureTask<Integer> rs = new FutureTask<>(c);

        new Thread(rs).start();

        try {
            int result = rs.get();
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
