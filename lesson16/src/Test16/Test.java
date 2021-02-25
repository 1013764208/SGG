package Test16;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author HXS
 * @create 2021-02-25 15:09
 */

/*
    创建线程的方式三：实现Callable 接口 -- JDK 5.0 新增

    如果理解实现Callable接口的方式创建多线程比实现 Runnable 接口创建多线程方式强大 ?
    1. call() 方法有返回值
    2. call() 可以抛出异常，被外面的操作捕获，获取异常的信息
    3. callable 支持泛型


 */

// 1. 创建一个实现Callable的实现类
class NumThread implements Callable {

    // 2. 实现call方法，将此线程需要执行的操作声明在call方法中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class Test {
    public static void main(String[] args) {
        // 3. 创建Callable接口实现类的对象
        NumThread numThread = new NumThread();

        // 4. 将此Callable接口实现类的对象传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);

        // 5. 将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start
        Thread t1 = new Thread(futureTask);
        t1.start();



        try {
            // 6. 获取 Callable中call方法的返回值
            // get() 返回值即为FutureTask构造器参数callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}



