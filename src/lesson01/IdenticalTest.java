package lesson01;

import java.awt.*;

/*
    1. 标识符：
    Java 对各种变量、方法和类等要素命名时使用的字符序列称为标识符
    技巧：凡是自己可以起名字的地方都叫标识符

    2. 定义合法标识符规则：
    由26个英文字母大小写，0-9 ，_或 $ 组成
    数字不可以开头
    不可以使用关键字和保留字，但能包含关键字和保留字。
    Java中严格区分大小写，长度无限制
    标识符不能包含空格

    3. java中的名称命名规范
    包名：多单词组成时所有字母都小写：xxxyyyzzz  驼峰命名法
    类名、接口名：多单词组成时，所有单词的首字母大写：XxxYyyZzz
    变量名、方法名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写：xxxYyyZzz
    常量名：所有字母都大写。多单词时每个单词用下划线连接：XXX_YYY_ZZZ

    4. 见名知意
 */
public class IdenticalTest {
    public static void main(String[] args){
        int myNumber = 100;
        System.out.println(myNumber);
    }
}
