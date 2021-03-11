package Test01;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author HXS
 * @create 2021-03-11 10:25
 */

/*
    了解类的加载器

 */
public class Test02 {

    @Test
    public void test1(){
        // 对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = Test02.class.getClassLoader();
        System.out.println(classLoader);

        // 调用系统类加载器的getParent(): 获取扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        // 调用扩展类加载器的getParent(): 无法获取引导类的加载器
        // 引导类加载类主要负责加载java的核心类库，无法加载自定义类的
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

    }

    /*
        Properties：用来读取配置文件
     */
    @Test
    public void test2() throws IOException {
        Properties pros = new Properties();
        // 此时的文件默认在当前的module下
        // 读取配置文件的方式 1：
        FileInputStream fis = new FileInputStream("jdbc.properties");
        pros.load(fis);

        // 读取配置文件的方式 2：使用classLoader
        // 配置文件默认识别为：当前module的src下
        ClassLoader classLoader = Test02.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);


        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println(("user: " + user + "  password: " + password));
    }
}
