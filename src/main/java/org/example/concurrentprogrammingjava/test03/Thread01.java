package org.example.concurrentprogrammingjava.test03;

/**
 * 因为interrupt()方法只能中断阻塞过程中的线程而不能中断正在运行过程中的线程。
 *
 * 在运行中的线程使用：
 * 注意调用此方法仅仅是在当前线程打一个停止标志，并不是真正的停止线程。
 * 例如在线程1中调用线程b的interrupt(),在b线程中监听b线程的中断标志，来处理结束。
 */
public class Thread01 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            // 判断中断标志
            if (this.isInterrupted()) {
                //如果为true，结束线程
            }
            System.out.println("thread 1 --->" + i);
        }
    }
}
