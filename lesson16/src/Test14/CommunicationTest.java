package Test14;

/**
 * @author HXS
 * @create 2021-02-25 12:26
 */

/*
    EX- 线程通信: 使用两个线程打印 1-100 线程 1，线程 2 交替打印

    涉及方法
    wait(): 一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
    notify(): 一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程被wait，就唤醒优先级高的线程
    notifyAll(): 一旦执行此方法，就会唤醒所有被wait的线程

    说明：
    1. wait(),notify(),notifyAll() 三个方法必须使用在同步代码块或同步方法中
    2. 三个方法的调用者必须是同步代码块或同步方法中的同比监视器，否则会出现异常
    3. 三个方法定义在 lang.Object 中

    面试题：
    1. sleep() 和 wait() 异同
    相同：一旦执行此方法，都可以使得当前的线程进入阻塞状态
    不同：1. 两个方法声明的位置不同：Thread类中声明 sleep，Object类中声明wait
         2. 调用的要求不同：sleep 可以在任何需要的场景下调用，wait 必须使用在同步代码块或同步方法中
         3. 关于是否释放同步监视器：如果两个方法都使用在同步代码块中或同步方法中，sleep 不会是否锁，wait会释放锁


 */



class Number implements Runnable {

    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {

                // 唤醒
                this.notify(); // 与同步监视器一致

                if (number <= 100) {

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        // 使得调用如下wait方法的线程进入阻塞状态
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
