package org.example.concurrentprogrammingjava.test01.example01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 使用线程池创建
 *
 * 创建了一个 ExecutorService，使用了 Executors.newCachedThreadPool() 来创建一个可缓存的线程池。
 * executorService.execute() 提交了一个匿名 Runnable 任务，这个任务会在某个线程中运行并打印当前线程的信息。
 * executorService.submit(new Thread02()) 提交了一个 Thread02 类型的任务，它也会在一个线程中运行并打印信息。
 * 最后，调用 executorService.shutdown() 来优雅地关闭线程池。
 */
public class Thread06 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"我是子线程1");
            }
        });
        executorService.submit(new Thread02()); //submit一个线程到线程池

        // 关闭线程池，等待所有任务完成后关闭
        executorService.shutdown();
    }

}
