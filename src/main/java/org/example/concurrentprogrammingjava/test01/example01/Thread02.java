package org.example.concurrentprogrammingjava.test01.example01;

/**
 * 实现Runnable接口创建线程
 */
public class Thread02 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"我是子线程");
    }
    public static void main(String[] args) {
        new Thread(new Thread02()).start();
    }
}
