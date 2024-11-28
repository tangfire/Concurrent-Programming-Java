package org.example.concurrentprogrammingjava.test01.example01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用Callable和 Future创建线程
 * Callable和Future线程可以获取到返回结果，底层基于LockSupport。 （这里只是略写，后面有详细介绍）
 */
public class Thread05 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "return 1");
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Thread05 callable = new Thread05();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(callable);
        new Thread(integerFutureTask).start();

        // 通过api获取返回结果，主线程需要等待子线程返回结果
        Integer result = integerFutureTask.get();
        System.out.println(Thread.currentThread().getName() + "return " + result);

    }
}
