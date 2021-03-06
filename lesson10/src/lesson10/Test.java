package lesson10;
/*
    方法重写 override / overwrite

    1. 重写：子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作
    2. 应用：重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写父类的方法
    3. 重写的规定
        方法的声明：权限修饰词 返回值类型 方法名（形参列表） throws 异常的类型{
                // 方法体
            }
        约定俗成：子类中的叫重写的方法，父类中的叫被重写的方法
        1. 子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同

        2. 子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符
           特殊情况：子类不能重写父类中声明为 private方法

        3. 返回值类型
        3.1 父类被重写的方法的返回值是void，则子类重写的方法的返回值只能是void
        3.2 父类被重写的方法的返回值是A类型，则子类重写的方法的返回值可以是A类或A类的子类
        3.3 父类被重写的方法的返回值类似是基本数据类型（EX - double），则子类重写的方法的返回值类型必须是相同的基本类型（必须是 double）

        4. 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 --------------------------------------------------------------------------------------------------------------------
        子类和父类中同名同参的方法要么都声明为非static的（考虑重写），要么都声明为static的（不是重写）


    面试题 - 区分方法的重载与重写

 */
public class Test {
    public static void main(String[] args) {

        Student s = new Student("计算机科学与技术");
        s.eat();  // 子类重写方法
        s.walk(10);
        s.study();

        Person p = new Person();
        p.eat();  // 父类方法
    }
}
