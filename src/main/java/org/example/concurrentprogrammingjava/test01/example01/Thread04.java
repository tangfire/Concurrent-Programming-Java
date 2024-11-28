package org.example.concurrentprogrammingjava.test01.example01;

/**
 * 使用
 */
public class Thread04 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "child Thread")).start();
    }
}
