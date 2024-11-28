package org.example.concurrentprogrammingjava.test01.example01;

/**
 * 使用匿名内部类
 */
public class Thread03 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Thread 3");
            }
        }).start();
    }
}
