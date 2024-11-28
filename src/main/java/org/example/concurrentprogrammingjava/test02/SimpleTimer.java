package org.example.concurrentprogrammingjava.test02;

/**
 * sleep()
 * Thread.sleep(millis); //让当前线程休眠指定的毫秒数
 * 使用线程休眠，实现一个简单的计数器。
 */

public class SimpleTimer {

    public static void main(String[] args) {
        int remaining = 10 ; //从60秒开始计时

        while(true){
            try {
                System.out.println("时间：  " + remaining);
                if (remaining >= 0){ remaining--; }
                Thread.sleep(1000); //线程休眠
                if(remaining == -1){break;}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

