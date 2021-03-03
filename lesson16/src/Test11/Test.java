package Test11;

/**
 * @author HXS
 * @create 2021-02-25 11:09
 */

/*
    演示线程的死锁问题

    1. 死锁理解：不同的线程分别占用对方需要的同步资源不放弃都在
               等待对方放弃自己需要的同步资源，就形成了线程的死锁
    2. 说明
    2.1 出现死锁后，不会出现异常，不会提示，只是所有的线程都处于阻塞状态，无法继续
    2.2 我们使用同步时，要避免出现死锁
 */

public class Test {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread(){
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {
                        s1.append("b");
                        s2.append("1");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                    synchronized (s2) {

                    s1.append("c");
                    s2.append("3");

                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        synchronized (s1) {
                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }

            }
        }).start();
    }
}