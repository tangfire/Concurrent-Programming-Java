package org.example.concurrentprogrammingjava.test03;

public class YieldTest {
    public static void main(String[] args) {
        Thread01 t1 = new Thread01();
        t1.start(); //开启子线程

        //当前线程main线程
        for (int i = 1; i < 100; i++) {
            System.out.println("main --->" + i);
        }
        //打印完main线程中100个后，中断子线程,仅仅是个标记，必须在线程中处理
        t1.interrupt();
    }
}
