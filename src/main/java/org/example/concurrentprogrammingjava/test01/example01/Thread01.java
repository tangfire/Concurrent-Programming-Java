package org.example.concurrentprogrammingjava.test01.example01;

/**
 * 继承Thread类创建线程
 */
public class Thread01 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("child Thread-1");
        }
    }

    public static void main(String[] args) {
        Thread01 t = new Thread01();
        t.start();
    }
}
