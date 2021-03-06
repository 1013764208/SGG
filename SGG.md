## 1. JAVA 概述

## 2. 基本语法

## 3. 数组

### 3.1 数组概述

#### 1.数组的理解：

数组(Array)，是多个相同类型数据一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行统一管理



#### 2.数组相关的概念：

数组名

元素

角标、下标、索引

数组的长度：元素的个数



#### 3.数组的特点：

1.数组是序排列的

2.数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型

3.创建数组对象会在内存中开辟一整块连续的空间

4.数组的长度一旦确定，就不能修改。



#### 4.数组的分类：

① 照维数：一维数组、二维数组、。。。

② 照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组

##### 数据结构：

1.数据与数据之间的逻辑关系：集合、一对一、一对多、多对多
2.数据的存储结构：
线性表：顺序表（比如：数组）、链表、栈、队列
树形结构：二叉树
图形结构：



##### 算法：

排序算法：
搜索算法：



### 3.2 一维数组

#### 1.一维数组的声明与初始化

```

	int num;//声明
	num = 10;//初始化
	int id = 1001;//声明 + 初始化
		
正确的方式：
	int[] ids;//声明
	//1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
	ids = new int[]{1001,1002,1003,1004};
	//1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
	String[] names = new String[5];
	
	int[] arr4 = {1,2,3,4,5};//类型推断

错误的方式：
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3]{1,2,3};
```





#### 2.一维数组元素的引用：通过角标的方式调用。

```
	//数组的角标（或索引从0开始的，到数组的长度-1结束。
		names[0] = "王铭";
		names[1] = "王赫";
		names[2] = "张学良";
		names[3] = "孙居龙";
		names[4] = "王宏志";//charAt(0)
```



​	

#### 3.数组的属性：length

```
System.out.println(names.length);//5
System.out.println(ids.length);
```



##### 说明：数组一旦初始化，其长度就是确定的。arr.length

#####              数组长度一旦确定，就不可修改。



#### 4.一维数组的遍历

```
for(int i = 0;i < names.length;i++){
	System.out.println(names[i]);
}
```



#### 5.一维数组元素的默认初始化值

数组元素是整型：0

数组元素是浮点型：0.0

数组元素是char型：0或'\u0000'，而非'0'

数组元素是boolean型：false

数组元素是引用数据类型：null





#### 6.一维数组的内存解析

![image-20210221150515142](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221150515142.png)





### 3.2 二维数组

#### 1.如何理解二维数组？

数组属于引用数据类型
数组的元素也可以是引用数据类型
一个一维数组A的元素如果还是一个一维数组类型的，则，此数组A称为二维数组

#### 2.二维数组的声明与初始化

正确的方式：

	int[] arr = new int[]{1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
	//也是正确的写法：
		int[] arr4[] = new int[][]{{1,2,3},{4,5,9,10},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};//类型推断
错误的方式：

```
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][] arr6 = new int[4][3]{{1,2,3},{4,5},{6,7,8}};
```



#### 3.如何调用二维数组元素:

```
System.out.println(arr1[0][1]);//2
System.out.println(arr2[1][1]);//null
arr3[1] = new String[4];
System.out.println(arr3[1][0]);
System.out.println(arr3[0]);//
```

#### 4.二维数组的属性：

```
System.out.println(arr4.length);//3
System.out.println(arr4[0].length);//3
System.out.println(arr4[1].length);//4
```

#### 5.遍历二维数组元素

```
	for(int i = 0;i < arr4.length;i++){
		for(int j = 0;j < arr4[i].length;j++){
			System.out.print(arr4[i][j] + "  ");
		}
		System.out.println();
	}		
```



#### 6.二维数组元素的默认初始化值

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151019103.png" alt="image-20210221151019103" style="zoom:50%;" />

#### 7.二维数组的内存结构

![image-20210221151027419](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151027419.png)





### 3.3 数组的常见算法

#### 1.数组的创建与元素赋值：

杨辉三角（二维数组）、回形数（二维数组）、6个数，

1-30之间随机生成且不重复

#### 2.针对于数值型的数组：

最大值、最小值、总和、平均数等

#### 3.数组的赋值与复制

```
int[] array1,array2;
array1 = new int[]{1,2,3,4};
```



##### 3.1 赋值：

```
array2 = array1;
```

如何理解：将array1保存的数组的地址值赋给了array2，使得array1和array2共同指向堆空间中的同一个数组实体。

![image-20210221151246937](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151246937.png)

##### 3.2 复制：

```
array2 = new int[array1.length];
for(int i = 0;i < array2.length;i++){
	array2[i] = array1[i];
}
```

如何理解：我们通过new的方式，给array2在堆空间中新开辟了数组的空间。将array1数组中的元素值一个一个的赋值到array2数组中。

#### 4.数组元素的反转

```
//方法一：
//		for(int i = 0;i < arr.length / 2;i++){
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i -1];
//			arr[arr.length - i -1] = temp;
//		}

//方法二：
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
```



##### 5.数组中指定元素的查找：搜索、检索

##### 5.1 线性查找： 

实现思路：通过遍历的方式，一个一个的数据进行比较、查找。
适用性：具有普遍适用性。

##### 5.2 二分法查找：

实现思路：每次比较中间值，折半的方式检索。
适用性：（前提：数组必须有序）

#### 6.数组的排序算法

![image-20210221151456555](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151456555.png)



![image-20210221151516037](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151516037.png)

![image-20210221151539650](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221151539650.png)

##### 4.手写冒泡

	int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
		
		//冒泡排序
		for(int i = 0;i < arr.length - 1;i++){
			
			for(int j = 0;j < arr.length - 1 - i;j++){
				
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
			
		}		


### 3.4 Arrays 工具类的使用

#### 1.理解：

① 定义在java.util包下。
② Arrays:提供了很多操作数组的方法。

#### 2.使用：

	//1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
		int[] arr1 = new int[]{1,2,3,4};
		int[] arr2 = new int[]{1,3,2,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//2.String toString(int[] a):输出数组信息。
		System.out.println(Arrays.toString(arr1));
		
		//3.void fill(int[] a,int val):将指定值填充到数组之中。
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));
		
		//4.void sort(int[] a):对数组进行排序。
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		//5.int binarySearch(int[] a,int key)
		int[] arr3 = new int[]{1,2....}		   
		int index = Arrays.binarySearch(arr3, 210);
		if(index >= 0){
			System.out.println(index);
		}else{
			System.out.println("未找到");
		}


​					



### 3.5 数组常见异常

#### 1.数组角标越界异常：ArrayIndexOutOfBoundsException

		int[] arr = new int[]{1,2,3,4,5};
		//		for(int i = 0;i <= arr.length;i++){
		//			System.out.println(arr[i]);
		//		}
			
		//		System.out.println(arr[-2]);
			
		//		System.out.println("hello");

#### 2.空指针异常：NullPointerException

```
//情况一：
//		int[] arr1 = new int[]{1,2,3};
//		arr1 = null;
//		System.out.println(arr1[0]);

//情况二：
//		int[][] arr2 = new int[4][];
//		System.out.println(arr2[0][0]);

//情况：
	String[] arr3 = new String[]{"AA","BB","CC"};
	arr3[0] = null;
	System.out.println(arr3[0].toString());		
```

##### 小知识：一旦程序出现异常，未处理时，就终止执行。





## 4. 面向对象 - 上







## 5.  面向对象 - 中

### 5.1 面向对象的特征二：继承性

#### 1.  为什么要有类的继承性？(继承性的好处）

 1.  减少了代码的冗余，提高了代码的复用性

 2.  便于功能的扩展

 3.  为之后多态性的使用，提供了前提

  ![image-20210215102944542](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215102944542.png)



#### 2. 继承性的格式：

class A extends B{}


 A:子类、派生类、subclass

 B:父类、超类、基类、superclass



#### 3. 子类继承父类以后有哪些不同？

##### 3.1 体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的所有的属性和方法。

特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私的结构。只因为封装性的影响，使得子类不能直接调用父类的结构而已。



##### 3.2 子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展。

 子类和父类的关系，不同于子集和集合的关系。
 extends：延展、扩展



#### 4. Java中继承性的说明

1.一个类可以被多个子类继承。

2.Java中类的单继承性：一个类只能有一个父类

3.子父类是相对的概念。

4.子类直接继承的父类，称为：直接父类。间接继承的父类称为：间接父类

5.子类继承父类以后，就获取了直接父类以及所间接父类中声明的属性和方法

![image-20210215103211173](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215103211173.png)

#### 5. java.lang.Object类的理解

1.如果我们没显式的声明一个类的父类的话，则此类继承于java.lang.Object类

2.所的java类（除java.lang.Object类之外都直接或间接的继承于java.lang.Object类

3.意味着，所的java类具有java.lang.Object类声明的功能。





### 5.2 方法的重写

#### 1. 什么是方法的重写(override 或 overwrite)？

子类继承父类以后，可以对父类中同名同参数的方法，进行覆盖操作

#### 2. 应用

重写以后，当创建子类对象以后，通过子类对象调用子父类中的同名同参数的方法时，实际执行的是子类重写父类的方法

#### 3. 举例

#### 4. 重写的规则

方法的声明： 权限修饰符  返回值类型  方法名(形参列表) throws 异常的类型{
 								 //方法体

约定俗称：子类中的叫重写的方法，父类中的叫被重写的方法

1.子类重写的方法的方法名和形参列表与父类被重写的方法的方法名和形参列表相同

2.子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符

特殊情况：子类不能重写父类中声明为private权限的方法

3.返回值类型：

3.1 父类被重写的方法的返回值类型是void，则子类重写的方法的返回值类型只能是void
	
3.2 父类被重写的方法的返回值类型是A类型，则子类重写的方法的返回值类型可以是A类或A类的子类
	
3.3 父类被重写的方法的返回值类型是基本数据类型(比如：double)，则子类重写的方法的返回值类型必须是相同的基本数据类型(必须也是double)

4.子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型（具体放到异常处理时候讲）

注：子类和父类中的同名同参数的方法要么都声明为非static的（考虑重写，要么都声明为static的（不是重写)。	



#### 5. 面试题
区分方法的重写和重载？
答： ① 二者的概念：
         ② 重载和重写的具体规则
         ③ 重载：不表现为多态性

重写：表现为多态性。
重载：是指允许存在多个同名方法，而这些方法的参数不同。编译器根据方法不同的参数表，对同名方法的名称做修饰。对于编译器而言，这些同名方法就成了不同的方法。它们的调用地址在编译期就绑定了。Java的重载是可以包括父类和子类的，即子类可以重载父类的同名不同参数的方法。

所以：对于重载而言，在方法调用之前，编译器就已经确定了所要调用的方法，这称为“**早绑定**”或“**静态绑定**”；

而对于多态，只等到方法调用的那一刻，解释运行器才会确定所要调用的具体方法，这称为“**晚绑定**”或“**动态绑定**”。 

引用一句Bruce Eckel的话：“不要犯傻，如果它不是晚绑定，它就不是多态。”





### 5.3 关键字 super

#### 1. super 关键字可以理解为：父类的

#### 2.可以用来调用的结构：

属性、方法、构造器

#### 3. super调用属性、方法：

3.1 我们可以在子类的方法或构造器中。通过使用"super.属性"或"super.方法"的方式，显式的调用父类中声明的属性或方法。但是，通常情况下，我们习惯省略"super."
3.2 特殊情况：当子类和父类中定义了同名的属性时，我们要想在子类中调用父类中声明的属性，则必须显式的使用"super.属性"的方式，表明调用的是父类中声明的属性。
3.3 特殊情况：当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式的使用"super.方法"的方式，表明调用的是父类中被重写的方法。

#### 4. super调用构造器：

4.1  我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
4.2 "super(形参列表)"的使用，必须声明在子类构造器的首行！
4.3 我们在类的构造器中，针对于"this(形参列表)"或"super(形参列表)"只能二一，不能同时出现
4.4 在构造器的首行，没显式的声明"this(形参列表)"或"super(形参列表)"，则默认调用的是父类中空参的构造器：super()
4.5 在类的多个构造器中，至少一个类的构造器中使用了"super(形参列表)"，调用父类中的构造器







### 5.3 子类对象实例化全过程

#### 1.从结果上看：继承性

子类继承父类以后，就获取了父类中声明的属性或方法。
创建子类的对象，在堆空间中，就会加载所父类中声明的属性。

#### 2.从过程上看：

当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类的构造器，...直到调用了java.lang.Object类中空参的构造器为止。正因为加载过所的父类的结构，所以才可以看到内存中父类中的结构，子类对象才可以考虑进行调用。

![image-20210215171734068](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215171734068.png)

#### 3.强调说明：

虽然创建子类对象时，调用了父类的构造器，但是自始至终就创建过一个对象，即为new的子类对象。

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210215172059526.png" alt="image-20210215172059526" style="zoom: 67%;" />

### 5.4 面向对象的特征三：多态

#### 1.多态性的理解：可以理解为一个事物的多种形态。

#### 2.何为多态性：

对象的多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
举例：
Person p = new Man();
Object obj = new Date();

#### 3.多态性的使用：虚拟方法调用

有了对象的多态性以后，我们在编译期，只能调用父类中声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
总结：编译，看左边；运行，看右边。

#### 4.多态性的使用前提：

① 类的继承关系  ② 方法的重写

#### 5.多态性的应用举例：

举例一：

public void func(Animal animal){//Animal animal = new Dog();
	animal.eat();
	animal.shout();
}
举例二：
public void method(Object obj){

}

举例三：
class Driver{

public void doData(Connection conn){//conn = new MySQlConnection(); / conn = new OracleConnection();
		//规范的步骤去操作数据
//		conn.method1();
//		conn.method2();
//		conn.method3();
			}

}

#### 6.多态性使用的注意点：

对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）

#### 7.关于向上转型与向下转型：

#### 7.1 向上转型：多态

#### 7.2 向下转型：

#### 7.2.1 为什么使用向下转型：

有了对象的多态性以后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。如何才能调用子类特的属性和方法？使用向下转型。

#### 7.2.2 如何实现向下转型：

使用强制类型转换符：()

#### 7.2.3 使用时的注意点：

① 使用强转时，可能出现ClassCastException的异常。
② 为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回true，就进行向下转型。如果返回false，不进行向下转型。

#### 7.2.4 instanceof的使用：

① a instanceof A:判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。
② 如果 a instanceof A返回true,则 a instanceof B也返回true.其中，类B是类A的父类。
③ 要求a所属的类与类A必须是子类和父类的关系，否则编译错误。

#### 7.2.5 图示：

![image-20210217130104175](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217130104175.png)

#### 8. 面试题：

8.1 谈谈你对多态性的理解？
① 实现代码的通用性。
② Object类中定义的public boolean equals(Object obj){  }
 JDBC:使用java程序操作(获取数据库连接、CRUD)数据库(MySQL、Oracle、DB2、SQL Server)
③ 抽象类、接口的使用肯定体现了多态性。（抽象类、接口不能实例化）
8.2 多态是编译时行为还是运行时行为？





### 5.5 Object类的使用

#### 1.java.lang.Object类的说明：

1.Object类是所Java类的根父类
2.如果在类的声明中未使用extends关键字指明其父类，则默认父类为 java.lang.Object类 
3.Object类中的功能(属性、方法)就具通用性。
	 属性：无
 	方法：equals() / toString() / getClass() /hashCode() / clone() / finalize()
 wait() 、 notify()、notifyAll()

4.Object类只声明了一个空参的构造器

##### 2.equals()方法
#### 2.1 equals()的使用：
1.是一个方法，而非运算符
2.只能适用于引用数据类型
3.Object类中equals()的定义：
 public boolean equals(Object obj) {
           return (this == obj);
     }
说明：Object类中定义的equals()和==的作用是相同的：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体

4.像String、Date、File、包装类等都重写了Object类中的equals()方法。重写以后，比较的不是两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。 

5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同。那么，我们就需要对Object类中的equals()进行重写.
重写的原则：比较两个对象的实体内容是否相同.

#### 2.2 如何重写equals()

#### 2.2.1 手动重写举例：

class User{
String name;
int age;
//重写其equals()方法
public boolean equals(Object obj){
	if(obj == this){
		return true;
	}
	if(obj instanceof User){
		User u = (User)obj;
		return this.age == u.age && this.name.equals(u.name);
	}
	return false;
}
}

#### 2.2.2 开发中如何实现：自动生成的

#### 3. 回顾 == 运算符的使用：

== ：运算符

 * 可以使用在基本数据类型变量和引用数据类型变量中
 * 如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定类型要相同）

如果比较的是引用数据类型变量：比较两个对象的地址值是否相同.即两个引用是否指向同一个对象实体

补充： == 符号使用时，必须保证符号左右两边的变量类型一致。

toString()方法

#### 3.1 toString()的使用：

当我们输出一个对象的引用时，实际上就是调用当前对象的toString()



Object类中toString()的定义：

public String toString() {
   return getClass().getName() + "@" + Integer.toHexString(hashCode());
}



像String、Date、File、包装类等都重写了Object类中的toString()方法。

使得在调用对象的toString()时，返回"实体内容"信息



自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"

#### 3.2 如何重写toString()

举例：
//自动实现

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

#### 4.面试题：

① final、finally、finalize的区别？
②  == 和 equals() 区别



### 5.6 单元测试

Java中的JUnit单元测试



步骤：

1.中当前工程 - 右键择：build path - add libraries - JUnit 4 - 下一步

2.创建Java类，进行单元测试。

此时的Java类要求：① 此类是public的  ②此类提供公共的无参的构造器

3.此类中声明单元测试方法。

此时的单元测试方法：方法的权限是public,没返回值，没形参



4.此单元测试方法上需要声明注解：@Test01,并在单元测试类中导入：import org.junit.Test01;



5.声明好单元测试方法以后，就可以在方法体内测试相关的代码。

6.写完代码以后，左键双击单元测试方法名，右键：run as - JUnit Test01



说明：

1.如果执行结果没任何异常：绿条

2.如果执行结果出现异常：红条



### 5.7 包装类

#### 1.为什么要有包装类(或封装类）

为了使基本数据类型的变量具有类的特征，引入包装类。

#### 2.基本数据类型与对应的包装类：

![image-20210217135004689](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217135004689.png)

#### 3.需要掌握的类型间的转换：（基本数据类型、包装类、String）

![image-20210217135010336](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210217135010336.png)

###### 简易版：

基本数据类型<--->包装类：JDK 5.0 新特性：自动装箱 与自动拆箱
基本数据类型、包装类--->String:调用String重载的valueOf(Xxx xxx)
String--->基本数据类型、包装类:调用包装类的parseXxx(String s)
     注意：转换时，可能会报NumberFormatException
应用场景举例：
① Vector类中关于添加元素，只定义了形参为Object类型的方法：
v.addElement(Object obj);   //基本数据类型 --->包装类 --->使用多态

###### 



## 6. 面向对象 - 下

### 6.1 关键字 static

#### static:静态的

#### 1.可以用来修饰的结构：主要用来修饰类的内部结构

属性、方法、代码块、内部类

#### 2.static修饰属性：静态变量（或类变量）

##### 2.1 属性，是否使用static修饰，又分为：静态属性  vs 非静态属性(实例变量)

实例变量：我们创建了类的多个对象，每个对象都独立的拥一套类中的非静态属性。当修改其中一个对象中的非静态属性时，不会导致其他对象中同样的属性值的修改。

静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。

##### 2.2 static修饰属性的其他说明：

① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式进行调用

② 静态变量的加载要早于对象的创建。

③ 由于类只会加载一次，则静态变量在内存中也只会存在一份：存在方法区的静态域中。

④		类变量	实例变量

类		yes		no

对象	yes		yes

​	

##### 2.3 静态属性举例：System.out; Math.PI;

#### 3.静态变量内存解析：

![image-20210219122455809](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210219122455809.png)

#### 4.static修饰方法：静态方法、类方法

① 随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
②			          静态方法	非静态方法

​	类		    yes		no

​	对象		yes		yes
③ 静态方法中，只能调用静态的方法或属性
  非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性

##### static的注意点：

##### 5.1 在静态的方法内，不能使用this关键字、super关键字

##### 5.2 关于静态属性和静态方法的使用，大家都从生命周期的角度去理解。

#### 6.如何判定属性和方法应该使用static关键字：

##### 6.1 关于属性

属性是可以被多个对象所共享的，不会随着对象的不同而不同的。
类中的常量也常常声明为static

##### 6.2 关于方法

操作静态属性的方法，通常设置为static的
工具类中的方法，习惯上声明为static的。 比如：Math、Arrays、Collections

#### 7.使用举例：

举例一：Arrays、Math、Collections等工具类
举例二：单例模式
举例三：

````
class Circle{

	private double radius;
	private int id;//自动赋值
	
	public Circle(){
	id = init++;
	total++;
	}
	
	public Circle(double radius){
	this();
		id = init++;
		total++;
		this.radius = radius;
		

	}
	
	private static int total;//记录创建的圆的个数
	private static int init = 1001;//static声明的属性被所对象所共享
	
	public double findArea(){
		return 3.14 * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getTotal() {
		return total;
	}
}
````



#### 6.1.1 单例模式

#### 1.设计模式的说明

##### 1.1 理解

设计模式是在大量的实践中总结和理论化之后优的代码结构、编程风格、以及解决问题的思考方式。

##### 1.2 常用设计模式  --- 23种经典的设计模式  GOF

创建型模式，共5种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。 
结构型模式，共7种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。 
行为型模式，共11种：策略模式、模板方法模式、观察者模式、迭代器模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。 

#### 2.单例模式

##### 2.1 要解决的问题：

所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。

##### 2.2 具体代码的实现：

饿汉式1：
````
class Bank{
	
	//1.私化类的构造器
	private Bank(){
		
	}
	
	//2.内部创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance(){
		return instance;
	}
}
````
饿汉式2：使用了静态代码块
````
class Order{
	
	//1.私化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，没初始化
	//4.此对象也必须声明为static的
	private static Order instance = null;
	
	static{
		instance = new Order();
 }
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
		return instance;
	}

}
````
懒汉式：
````
class Order{
	
	//1.私化类的构造器
	private Order(){
		
	}
	
	//2.声明当前类对象，没初始化
	//4.此对象也必须声明为static的
	private static Order instance = null;
	
	//3.声明public、static的返回当前类对象的方法
	public static Order getInstance(){
		
		if(instance == null){
			
			instance = new Order();
			
		}
		return instance;
	}
}
````

##### 2.3 两种方式的对比：

饿汉式：	

坏处：对象加载时间过长。

好处：饿汉式是线程安全的



懒汉式：好处：延迟对象的创建。

目前的写法坏处：线程不安全。--->到多线程内容时，再修改



### 6.2 main 

main()方法作为程序的入口

main()方法也是一个普通的静态方法

main()方法可以作为我们与控制台交互的方式。（之前：使用Scanner）

如何将控制台获取的数据传给形参：String[] args?
  运行时：java 类名 "Tom" "Jerry" "123" "true"

sysout(args[0]);//"Tom"
sysout(args[3]);//"true"  -->Boolean.parseBoolean(args[3]);
sysout(args[4]);//报异常

小结：一叶知秋
public static void main(String[] args){//方法体}

权限修饰符：private 缺省 protected pubilc ---->封装性
修饰符：static \ final \ abstract \native 可以用来修饰方法
返回值类型： 无返回值 / 有返回值 -->return
方法名：需要满足标识符命名的规则、规范；"见名知意"
形参列表：重载 vs 重写；参数的值传递机制；体现对象的多态性
方法体：来体现方法的功能

````
main(){
Person p = new Man();
p.eat();
//p.earnMoney();

Man man = new Man();
man.eat();
man.earnMoney();
}
````




### 6.3 类的结构： 代码块

类的成员之四：代码块(初始化块)（重要性较属性、方法、构造器差一些）

#### 1.代码块的作用：用来初始化类、对象的信息

#### 2.分类：代码块要是使用修饰符，只能使用static

分类：静态代码块  vs 非静态代码块

#### 3.1 静态代码块：

内部可以输出语句
随着类的加载而执行,而且只执行一次
作用：初始化类的信息
如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
静态代码块的执行要优先于非静态代码块的执行
静态代码块内只能调用静态的属性、静态的方法，不能调用非静态的结构

#### 3.2 非静态代码块：

内部可以输出语句
随着对象的创建而执行
每创建一个对象，就执行一次非静态代码块
作用：可以在创建对象时，对对象的属性等进行初始化
如果一个类中定义了多个非静态代码块，则按照声明的先后顺序执行
非静态代码块内可以调用静态的属性、静态的方法，或非静态的属性、非静态的方法



#### 4.实例化子类对象时，涉及到父类、子类中静态代码块、非静态代码块、构造器的加载顺序：

对应的练习：LeafTest.java / Son.java
由父及子，静态先行。

#### 6.3.1  执行顺序

①默认初始化

②显式初始化/⑤在代码块中赋值

③构造器中初始化

④有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值



执行的先后顺序：① - ② / ⑤ - ③ - ④





### 6.4  关键字 final

#### 1.可以用来修饰：类、方法、变量

#### 2.具体的：

##### 2.1 final 用来修饰一个类:此类不能被其他类所继承。

比如：String类、System类、StringBuffer类

##### 2.2 final 用来修饰方法：表明此方法不可以被重写

比如：Object类中getClass();

##### 2.3 final 用来修饰变量：此时的"变量"就称为是一个常量

final修饰属性：可以考虑赋值的位置：显式初始化、代码块中初始化、构造器中初始化

final修饰局部变量：

尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋一个实参。一旦赋值以后，就只能在方法体内使用此形参，但不能进行重新赋值。

static final 用来修饰属性：全局常量







### 6.5 关键字 abstract

#### 1.可以用来修饰：类、方法

#### 2.具体的：

abstract修饰类：抽象类

#####  此类不能实例化

 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作 --->抽象的使用前提：继承性

##### abstract修饰方法：抽象方法

抽象方法只方法的声明，没方法体
包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
若子类重写了父类中的所的抽象方法后，此子类方可实例化
若子类没重写父类中的所的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰

#### 3.注意点：

1.abstract不能用来修饰：属性、构造器等结构

2.abstract不能用来修饰私方法、静态方法、final的方法、final的类

#### 4.abstract的应用举例：

举例一：

![image-20210220161805465](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220161805465.png)

举例二：
 ````
abstract class GeometricObject{
public abstract double findArea();
}
class Circle extends GeometricObject{
private double radius;
public double findArea(){
		return 3.14 * radius * radius;
};
}
 ````

举例三：
IO流中设计到的抽象类：InputStream/OutputStream / Reader /Writer。在其内部
定义了抽象的read()、write()方法。





### 6.6 关键字 interface

#### 1.使用说明：

1.1接口使用interface来定义

1.2Java中，接口和类是并列的两个结构

1.3如何定义接口：定义接口中的成员



1.3.1 JDK7及以前：只能定义全局常量和抽象方法

全局常量：public static final的.但是书写时，可以省略不写

抽象方法：public abstract的



1.3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法

接口中不能定义构造器的！意味着接口不可以实例化

Java开发中，接口通过让类去实现(implements)的方式来使用.



如果实现类覆盖了接口中的所抽象方法，则此实现类就可以实例化

如果实现类没覆盖接口中所的抽象方法，则此实现类仍为一个抽象类



Java类可以实现多个接口   --->弥补了Java单继承性的局限性

格式：class AA extends BB implements CC,DD,EE



接口与接口之间可以继承，而且可以多继承

接口的具体使用，体现多态性

接口，实际上可以看做是一种规范

##### 2.举例：

![image-20210220164720342](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220164720342.png)

````
class Computer{
	public void transferData(USB usb){
	//USB usb = new Flash();
		usb.start();
		
		System.out.println("具体传输数据的细节");
		
		usb.stop();
	}	
}
````



````
interface USB{
	//常量：定义了长、宽、最大最小的传输速度等
	

	void start();
	
	void stop();

}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U盘开启工作");
	}
	
	@Override
	public void stop() {
		System.out.println("U盘结束工作");
	}

}

class Printer implements USB{
	@Override
	public void start() {
		System.out.println("打印机开启工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机结束工作");
	}

}
````

#####  体会：

1.接口使用上也满足多态性

2.接口，实际上就是定义了一种规范

3.开发中，体会面向接口编程！	

#### 3.体会面向接口编程的思想

![image-20210220164820724](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220164820724.png)

面向接口编程：我们在应用程序中，调用的结构都是JDBC中定义的接口，不会出现具体某一个数据库厂商的API。

#### 4. Java8中关于接口的新规范

//知识点1：接口中定义的静态方法，只能通过接口来调用。

//知识点2：通过实现类的对象，可以调用接口中的默认方法。
//如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法

//知识点3：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的默认方法，那么子类在没重写此方法的情况下，默认调用的是父类中的同名同参数的方法。-->类优先原则
//知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
//那么在实现类没重写此方法的情况下，报错。-->接口冲突。
//这就需要我们必须在实现类中重写此方法
//知识点5：如何在子类(或实现类)的方法中调用父类、接口中被重写的方法

````
	public void myMethod(){
		method3();//调用自己定义的重写的方法
		super.method3();//调用的是父类中声明的
		//调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
````



#### 5.面试题：

抽象类和接口的异同？
相同点：不能实例化；都可以包含抽象方法的。
不同点：
1）把抽象类和接口(java7,java8,java9)的定义、内部结构解释说明
2）类：单继承性    接口：多继承
      类与接口：多实现



#### 6.6.1 代理模式

##### 1.解决的问题

代理模式是Java开发中使用较多的一种设计模式。代理设计就是为其他对象提供一种代理以控制对这个对象的访问。 

##### 2.举例

```
interface NetWork{
public void browse();
}

//被代理类
class Server implements NetWork{

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
	}

}
//代理类
class ProxyServer implements NetWork{
	

	private NetWork work;
	
	public ProxyServer(NetWork work){
		this.work = work;
	}


	public void check(){
		System.out.println("联网之前的检查工作");
	}
	
	@Override
	public void browse() {
		check();
		
		work.browse();
		
	}

}
```





##### 3.应用场景

![image-20210220165506183](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210220165506183.png)



#### 6.6.2 工厂模式

##### 1.解决的问题

实现了创建者与调用者的分离，即将创建对象的具体过程屏蔽隔离起来，达到提高灵活性的目的。

##### 2.具体模式

简单工厂模式：用来生产同一等级结构中的任意产品。（对于增加新的产品，需要修改已有代码）
工厂方法模式：用来生产同一等级结构中的固定产品。（支持增加任意产品)
抽象工厂模式：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族)







### 6.7 类的结构：内部类

内部类：类的第五个成员

#### 1.定义：Java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类.

#### 2.内部类的分类：

成员内部类（静态、非静态 ） vs 局部内部类(方法内、代码块内、构造器内)

#### 3.成员内部类的理解：

一方面，作为外部类的成员：
调用外部类的结构
可以被static修饰
可以被4种不同的权限修饰

另一方面，作为一个类：
 类内可以定义属性、方法、构造器等
 可以被final修饰，表示此类不能被继承。言外之意，不使用final，就可以被继承
 可以被abstract修饰

#### 4.成员内部类：

##### 4.1如何创建成员内部类的对象？(静态的，非静态的)

````
//创建静态的Dog内部类的实例(静态的成员内部类):
Person.Dog dog = new Person.Dog();

//创建非静态的Bird内部类的实例(非静态的成员内部类):
//Person.Bird bird = new Person.Bird();//错误的
Person p = new Person();
Person.Bird bird = p.new Bird();
````

##### 4.2如何在成员内部类中调用外部类的结构？

````
class Person{
	String name = "小明";
public void eat(){
}
//非静态成员内部类
	class Bird{
		String name = "杜鹃";
		public void display(String name){
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		//Person.this.eat();
		}
	}
}
````

#### 5.局部内部类的使用：

````
//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable(){
		
		//创建一个实现了Comparable接口的类:局部内部类
		//方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//			
//		}
//		
//		return new MyComparable();
		
		//方式二：
		return new Comparable(){

			@Override
			public int compareTo(Object o) {
				return 0;
			}	
		};		
	}
````

##### 注意点：

在局部内部类的方法中（比如：show如果调用局部内部类所声明的方法(比如：method)中的局部变量(比如：num)的话,要求此局部变量声明为final的。

jdk 7及之前版本：要求此局部变量显式的声明为final的
jdk 8及之后的版本：可以省略final的声明

##### 总结：

成员内部类和局部内部类，在编译以后，都会生成字节码文件。
格式：成员内部类：外部类$内部类名.class
            局部内部类：外部类$数字 内部类名.class





## 7. 异常处理

### 7.1 常见异常

#### 1.异常的体系结构



![image-20210221125131712](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125131712.png)

![image-20210221125151281](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125151281.png)

2.从程序执行过程，看编译时异常和运行时异常

![image-20210221125206500](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125206500.png)

编译时异常：执行javac.exe命名时，可能出现的异常
运行时异常：执行java.exe命名时，出现的异常

#### 3.常见的异常类型，请举例说明：

````
//******************以下是运行时异常***************************
	//ArithmeticException
	@Test
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
	

	//InputMismatchException
	@Test
	public void test5(){
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
		
		scanner.close();
	}
	
	//NumberFormatException
	@Test
	public void test4(){
		
		String str = "123";
		str = "abc";
		int num = Integer.parseInt(str);
	}
	
	//ClassCastException
	@Test
	public void test3(){
		Object obj = new Date();
		String str = (String)obj;
	}
	
	//IndexOutOfBoundsException
	@Test
	public void test2(){
		//ArrayIndexOutOfBoundsException

//		int[] arr = new int[10];
//		System.out.println(arr[10]);
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	

	//NullPointerException
	@Test
	public void test1(){

//		int[] arr = null;
//		System.out.println(arr[3]);
		

		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
		
	}
	
	//******************以下是编译时异常 
	@Test
	public void test7(){

//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//		
//		int data = fis.read();
//		while(data != -1){
//			System.out.print((char)data);
//			data = fis.read();
//		}
//		
//		fis.close();
		

	}
````





### 7.2 异常处理

#### 1.java异常处理的抓抛模型

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125450941.png" alt="image-20210221125450941" style="zoom: 150%;" />

#### 2.异常处理方式一：try-catch-finally

2.1 使用说明：

````
try{

    //可能出现异常的代码

    }catch(异常类型1 变量名1){
    //处理异常的方式1
    }catch(异常类型2 变量名2){
    //处理异常的方式2
    }catch(异常类型3 变量名3){
    //处理异常的方式3
    }
    ....
    finally{
    //一定会执行的代码
    }
````

![image-20210221125900228](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221125900228.png)



##### 2.3：[面试题] 

final、finally、finalize三者的区别？

类似：
throw 和 throws
Collection 和 Collections
String 、StringBuffer、StringBuilder
ArrayList 、 LinkedList
HashMap 、LinkedHashMap
重写、重载

结构不相似的：
抽象类、接口
== 、 equals()
sleep()、wait()

#### 3.异常处理方式二：throws

"throws + 异常类型"写在方法的声明处。指明此方法执行时，可能会抛出的异常类型。
一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throws后异常类型时，就会被抛出。异常代码后续的代码，就不再执行！

#### 4. 对比两种处理方式

try-catch-finally:真正的将异常给处理掉了。
throws的方式只是将异常抛给了方法的调用者。并没真正将异常处理掉。  



##### 5. 体会开发中应该如何选择两种处理方式？

5.1 如果父类中被重写的方法没throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法中异常，必须使用try-catch-finally方式处理。

5.2 执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。我们建议这几个方法使用throws的方式进行处理。而执行的方法a可以考虑使用try-catch-finally方式进行处理。



##### 补充：

方法重写的规则之一：
子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型







### 7.3 手动抛出异常对象

#### 1.使用说明

在程序执行中，除了自动抛出异常对象的情况之外，我们还可以手动的throw一个异常类的对象。

#### 2.[面试题] 

throw 和  throws区别：
throw 表示抛出一个异常类的对象，生成异常对象的过程。声明在方法体内。
throws 属于异常处理的一种方式，声明在方法的声明处。

#### 3.典型例题

````
class Student{
	
	private int id;
	
	public void regist(int id) throws Exception {
		if(id > 0){
			this.id = id;
		}else{
			//手动抛出异常对象

//			throw new RuntimeException("您输入的数据非法！");
//			throw new Exception("您输入的数据非法！");
			throw new MyException("不能输入负数");

		}
		
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
}
````



### 7.4 自定义异常类

如何自定义一个异常类？

![image-20210221130851870](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210221130851870.png)

```
public class MyException extends Exception{
	
	static final long serialVersionUID = -7034897193246939L;
	
	public MyException(){
		
	}
	
	public MyException(String msg){
		super(msg);
	}
}
```









## 8. 多线程

### 8.1 程序、进程、线程

#### 1. 程序(program)

是为完成特定任务、用某种语言编写的一组指令的集合。即指一 段静态的代码，静态对象

#### 2. 进程(process)

是程序的一次执行过程，或是正在运行的一个程序。是一个动态 的过程：有它自身的产生、存在和消亡的过程。——生命周期

说明：进程作为资源分配的单位，系统在运行时会为每个进程分配不同的内存区域

#### 3. 线程(thread)

进程可进一步细化为线程，是一个程序内部的一条执行路径

说明：线程作为调度和执行的单位，每个线程拥独立的运行栈和程序计数器(pc)，线程切换的开销小。



#### 4. 补充

内存结构

![image-20210224163236776](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210224163236776.png)



进程可以细化为多个线程。
每个线程，拥有自己独立的：栈、程序计数器
多个线程，共享同一个进程中的结构：方法区、堆





### 8.2 并发、并行

#### 1. 单核CPU与多核CPU的理解

单核CPU，其实是一种假的多线程，因为在一个时间单元内，也只能执行一个线程的任务。例如：虽然有多车道，但是收费站只有一个工作人员在收费，只有收了费才能通过，那么CPU就好比收费人员。如果某个人不想交钱，那么收费人员可以把他“挂起”（晾着他，等他想通了，准备好了钱，再去收费。）但是因为CPU时间单元特别短，因此感觉不出来。

如果是多核的话，才能更好的发挥多线程的效率。（现在的服务器都是多核的）

一个Java应用程序java.exe，其实至少三个线程：main()主线程，gc()垃圾回收线程，异常处理线程。当然如果发生异常，会影响主线程。



#### 2. 并行与并发的理解

并行：多个CPU同时执行多个任务。比如：多个人同时做不同的事。
并发：一个CPU(采用时间片)同时执行多个任务。比如：秒杀、多个人做同一件事







### 8.3 创建多线程的两种方式

#### 方式一：继承Thread类的方式：

1. 创建一个继承于Thread类的子类

2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中

3. 创建Thread类的子类的对象

4. 通过此对象调用start()：①启动当前线程 ② 调用当前线程的run()

##### 说明两个问题：

问题一：我们启动一个线程，必须调用start()，不能调用run()的方式启动线程。
问题二：如果再启动一个线程，必须重新创建一个Thread子类的对象，调用此对象的start().



#### 方式二：实现Runnable接口的方式：

1. 创建一个实现了Runnable接口的类

2. 实现类去实现Runnable中的抽象方法：run()

3. 创建实现类的对象

4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象

5. 通过Thread类的对象调用start()



##### 两种方式的对比：

开发中：优先选择：实现Runnable接口的方式

原因：1. 实现的方式没类的单继承性的局限性

2. 实现的方式更适合来处理多个线程共享数据的情况
   

##### 联系：public class Thread implements Runnable

**相同点**：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中。
    			目前两种方式，要想启动线程，都是调用的Thread类中的start()



### 8.4 Thread 常用的方法

```
1. start():启动当前线程；调用当前线程的run()
2. run(): 通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
3. currentThread():静态方法，返回执行当前代码的线程
4. getName():获取当前线程的名字
5. setName():设置当前线程的名字
6. yield():释放当前cpu的执行权
7. join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程 b 完全执行完以后，线程 a 才结束阻塞状态。
8. stop():已过时。当执行此方法时，强制结束当前线程。
9. sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态。
10. isAlive():判断当前线程是否存活
```

#### 线程的优先级

```

MAX_PRIORITY：10
MIN _PRIORITY：1 
NORM_PRIORITY：5  -->默认优先级

2.如何获取和设置当前线程的优先级：
  getPriority():获取线程的优先级
  setPriority(int p):设置线程的优先级
```

**说明**：高优先级的线程要抢占低优先级线程cpu的执行权。但是**只是从概率上讲**，高优先级的线程高概率的情况下被执行。**并不意味着只当高优先级的线程执行完以后，低优先级的线程才执行**

线程通信：wait() / notify() / notifyAll() :此三个方法定义在Object类中的



##### 补充：线程的分类

一种是守护线程，一种是用户线程





### 8.5 线程的生命周期

图示：

![image-20210225164943586](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210225164943586.png)

说明：

##### 1. 生命周期关注两个概念：状态、相应的方法

##### 2. 关注：状态a-->状态b:哪些方法执行了（回调方法）

#####                某个方法主动调用：状态a-->状态b

##### 3. 阻塞：临时状态，不可以作为最终状态

#####    死亡：最终状态



### 8.6 线程的同步机制

#### 1. 背景

例子：创建个窗口卖票，总票数为100张.使用实现Runnable接口的方式

##### 1. 问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题

##### 2. 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票

##### 3. 如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。





#### 2. Java解决方案：同步机制

##### 在Java中，我们通过同步机制，来解决线程的安全问题

##### 方式一：同步代码块

```
 synchronized(同步监视器){
	//需要被同步的代码
 }
```

说明：

1.操作共享数据的代码，即为需要被同步的代码。  -->不能包含代码多了，  也不能包含代码少了。

 2.共享数据：多个线程共同操作的变量。比如：ticket就是共享数据。

 3.同步监视器，俗称：锁。任何一个类的对象，都可以充当锁。

要求：多个线程必须要共用同一把锁。

补充：

1.在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器

2.在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器



##### 方式二：同步方法

如果操作共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的

关于同步方法的总结：

​	1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明		

​	2.非静态的同步方法，同步监视器是：this

   	静态的同步方法，同步监视器是：当前类本身



##### 方式三：Lock锁  --- JDK5.0新增

##### 面试题：synchronized 与 Lock的异同？

​	相同：二者都可以解决线程安全问题

​	不同：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器

​				Lock需要手动的启动同步，同时结束同步也需要手动的实现



##### 使用的优先顺序：

​	Lock ---> 同步代码块（已经进入了方法体，分配了相应资源 ) --->  

同步方法（在方法体之外)





#### 3. 利弊

同步的方式，解决了线程的安全问题。---好处
操作同步代码时，只能一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。





#### 4. 面试题

面试题：Java是如何解决线程安全问题的，有几种方式？并对比几种方式的不同

面试题：synchronized和Lock方式解决线程安全问题的对比

![image-20210225170139556](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210225170139556.png)



#### 8.6.1  单例模式 / 懒汉问题

#### 8.6.2 死锁问题 

##### 1.死锁的理解：

不同的线程分别占用对方需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程的死锁

##### 2.说明：

1.出现死锁后，不会出现异常，不会出现提示，只是所的线程都处于阻塞状态，无法继续

2.我们使用同步时，要避免出现死锁。









### 8.7 线程通信

#### 1.线程通信涉及到的三个方法：

wait():一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。

notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个。

notifyAll():一旦执行此方法，就会唤醒所有被wait的线程。



#### 2.说明

1.wait()，notify()，notifyAll()三个方法必须使用在同步代码块或同步方法中。

2.wait()，notify()，notifyAll()三个方法的调用者必须是同步代码块或同步方法中的同步监视器。

否则，会出现IllegalMonitorStateException异常

3.wait()，notify()，notifyAll()三个方法是定义在java.lang.Object类中。



#### 3.面试题：

##### 面试题：sleep() 和 wait()的异同？

**相同点**：一旦执行方法，都可以使得当前的线程进入阻塞状态。

**不同点**：1）两个方法声明的位置不同：Thread类中声明sleep() , Object类中声明wait()

​				2）调用的要求不同：sleep()可以在任何需要的场景下调用。 wait()必须使用在同步代码块或同步方法中

​				3）关于是否释放同步监视器：如果两个方法都使用在同步代码块或同步方法中，sleep()不会释放锁，wait()会释放锁。



#### 4.小结释放锁的操作

![image-20210225170633750](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210225170633750.png)



#### 5. 小结不会释放锁的操作

![image-20210225170701647](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210225170701647.png)





### 8.8  JDK5.0 新增线程创建方式

#### 新增方式一：实现Callable接口。 --- JDK 5.0新增



##### 如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？

1.call()可以返回值的。

2.call()可以抛出异常，被外面的操作捕获，获取异常的信息

3.Callable是支持泛型的





#### 新增方式二：使用线程池

##### 好处：

1.提高响应速度（减少了创建新线程的时间）

2.降低资源消耗（重复利用线程池中线程，不需要每次都创建）

3.便于线程管理

​	corePoolSize：核心池的大小

​	maximumPoolSize：最大线程数

​	keepAliveTime：线程没任务时最多保持多长时间后会终止



##### 面试题：Java中多线程的创建有几种方式？四种





## 9. 常用类

### 9.1 string 

java.lang.String类的使用

#### 1.概述

![image-20210302141339729](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302141339729.png)

#### 2.String的不可变性

##### 2.1 说明

![image-20210302141436014](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302141436014.png)

##### 2.2 代码举例

```
String s1 = "abc";//字面量的定义方式
String s2 = "abc";
s1 = "hello";

System.out.println(s1 == s2);//比较s1和s2的地址值

System.out.println(s1);//hello
System.out.println(s2);//abc

System.out.println("*****************");

String s3 = "abc";
s3 += "def";
System.out.println(s3);//abcdef
System.out.println(s2);

System.out.println("*****************");

String s4 = "abc";
String s5 = s4.replace('a', 'm');
System.out.println(s4);//abc
System.out.println(s5);//mbc
```



##### 2.3 图示

![image-20210302141517682](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302141517682.png)



#### 3.String实例化的不同方式

##### 3.1 方式说明

方式一：通过字面量定义的方式
方式二：通过new + 构造器的方式

##### 3.2 代码举例

```
//通过字面量定义的方式：此时的s1和s2的数据javaEE声明在方法区中的字符串常量池中
String s1 = "javaEE";
String s2 = "javaEE";
//通过new + 构造器的方式:此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
String s3 = new String("javaEE");
String s4 = new String("javaEE");

System.out.println(s1 == s2);//true
System.out.println(s1 == s3);//false
System.out.println(s1 == s4);//false
System.out.println(s3 == s4);//false
```



##### 3.3 面试题

String s = new String("abc");方式创建对象，在内存中创建了几个对象？
两个:一个是堆空间中new结构，另一个是char[]对应的常量池中的数据："abc"

##### 3.4 图示

![image-20210302141612037](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302141612037.png)

#### 4. 字符串拼接方式赋值的对比

##### 4.1 说明

1.常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
2.只要其中一个是变量，结果就在堆中。
3.如果拼接的结果调用intern()方法，返回值就在常量池中

##### 4.2 代码举例

```
String s1 = "javaEE";
String s2 = "hadoop";

String s3 = "javaEEhadoop";
String s4 = "javaEE" + "hadoop";
String s5 = s1 + "hadoop";
String s6 = "javaEE" + s2;
String s7 = s1 + s2;

System.out.println(s3 == s4);//true
System.out.println(s3 == s5);//false
System.out.println(s3 == s6);//false
System.out.println(s3 == s7);//false
System.out.println(s5 == s6);//false
System.out.println(s5 == s7);//false
System.out.println(s6 == s7);//false

String s8 = s6.intern();//返回值得到的s8使用的常量值中已经存在的“javaEEhadoop”
System.out.println(s3 == s8);//true


String s1 = "javaEEhadoop";
String s2 = "javaEE";
String s3 = s2 + "hadoop";
System.out.println(s1 == s3);//false

final String s4 = "javaEE";//s4:常量
String s5 = s4 + "hadoop";
System.out.println(s1 == s5);//true
```





#### 5.常用方法：

**int length()**：返回字符串的长度： return value.length
**char charAt(int index)**： 返回某索引处的字符return value[index]
**boolean isEmpty()**：判断是否是空字符串：return value.length == 0
**String toLowerCase()**：使用默认语言环境，将 String 中的所字符转换为小写
**String toUpperCase()**：使用默认语言环境，将 String 中的所字符转换为大写
**String trim()**：返回字符串的副本，忽略前导空白和尾部空白
**boolean equals(Object obj)**：比较字符串的内容是否相同
**boolean equalsIgnoreCase(String anotherString)**：与equals方法类似，忽略大小写
**String concat(String str)**：将指定字符串连接到此字符串的结尾。 等价于用“+”
**int compareTo(String anotherString)：**比较两个字符串的大小
**String substring(int beginIndex)：**返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
**String substring(int beginIndex, int endIndex)** ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。

**boolean endsWith(String suffix)：**测试此字符串是否以指定的后缀结束
**boolean startsWith(String prefix)：**测试此字符串是否以指定的前缀开始
**boolean startsWith(String prefix, int toffset)：**测试此字符串从指定索引开始的子字符串是否以指定前缀开始

**boolean contains(CharSequence s)：**当且仅当此字符串包含指定的 char 值序列时，返回 true
**int indexOf(String str)**：返回指定子字符串在此字符串中第一次出现处的索引
**int indexOf(String str, int fromIndex)**：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
**int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引**
**int lastIndexOf(String str, int fromIndex)：**返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索

注：indexOf和lastIndexOf方法如果未找到都是返回-1



替换：
**String replace(char oldChar, char newChar)**：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所 oldChar 得到的。
**String replace(CharSequence target, CharSequence replacement)**：使用指定的字面值替换序列替换此字符串所匹配字面值目标序列的子字符串。
**String replaceAll(String regex, String replacement)**：使用给定的 replacement 替换此字符串所匹配给定的正则表达式的子字符串。
**String replaceFirst(String regex, String replacement)：**使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串

匹配:
**boolean matches(String regex)：**告知此字符串是否匹配给定的正则表达式。

切片：
**String[] split(String regex)**：根据给定正则表达式的匹配拆分此字符串。
**String[] split(String regex, int limit)：**根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放到最后一个元素中。



#### 6. String与其它结构的转换	 

##### 6.1 与基本数据类型、包装类之间的转换

 String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
 基本数据类型、包装类 --> String:调用String重载的valueOf(xxx)

```
 @Test
 public void test1(){
     String str1 = "123";
	 //  int num = (int)str1;//错误的
     int num = Integer.parseInt(str1);
 	 String str2 = String.valueOf(num);//"123"
 	 String str3 = num + "";

	 System.out.println(str1 == str3);
}
```





##### 6.2 与字符数组之间的转换

String --> char[]:调用String的toCharArray()
char[] --> String:调用String的构造器

```
@Test
public void test2(){
    String str1 = "abc123";  //题目： a21cb3

    char[] charArray = str1.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
        System.out.println(charArray[i]);
    }
    
    char[] arr = new char[]{'h','e','l','l','o'};
    String str2 = new String(arr);
    System.out.println(str2);

}
```





##### 6.3 与字节数组之间的转换

编码：String --> byte[]:调用String的getBytes()
解码：byte[] --> String:调用String的构造器

编码：字符串 -->字节  (看得懂 --->看不懂的二进制数据)
解码：编码的逆过程，字节 --> 字符串 （看不懂的二进制数据 ---> 看得懂

说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码。

```
@Test
public void test3() throws UnsupportedEncodingException {
    String str1 = "abc123中国";
    byte[] bytes = str1.getBytes();//使用默认的字符集，进行编码。
    System.out.println(Arrays.toString(bytes));

    byte[] gbks = str1.getBytes("gbk");//使用gbk字符集进行编码。
    System.out.println(Arrays.toString(gbks));
    
    System.out.println("******************");
    
    String str2 = new String(bytes);//使用默认的字符集，进行解码
    System.out.println(str2);
    
    String str3 = new String(gbks);
    System.out.println(str3);//出现乱码 原因：编码集和解码集不一致


    String str4 = new String(gbks, "gbk");
    System.out.println(str4);//没出现乱码 原因：编码集和解码集一致

}
```






##### 6.4 与StringBuffer、StringBuilder之间的转换

String -->StringBuffer、StringBuilder: 调用StringBuffer、StringBuilder构造器

StringBuffer、StringBuilder -->String:①调用String构造器；②StringBuffer、StringBuilder的toString()



#### 7. JVM中字符串常量池存放位置说明：

jdk 1.6 (jdk 6.0 ,java 6.0):字符串常量池存储在方法区（永久区）
jdk 1.7:字符串常量池存储在堆空间
jdk 1.8:字符串常量池存储在方法区（元空间）

##### 1. 常见算法题目的考查：

1）模拟一个trim方法，去除字符串两端的空格。

2）将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”

3）获取一个字符串在另一个字符串中出现的次数。
      比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数

4）获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。

5）对字符串中字符进行自然顺序排序。
提示：
1.字符串变成字符数组。
2.对数组排序，择，冒泡，Arrays.sort();
3.将排序后的数组变成字符串。







### 9.2 string，stringBuffer，stringBuilder

#### 1.String、StringBuffer、StringBuilder三者的对比

![image-20210302142344655](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302142344655.png)

#### 2.StringBuffer与StringBuilder的内存解析

以StringBuffer为例： 

````
String str = new String();//char[] value = new char[0];
String str1 = new String("abc");//char[] value = new char[]{'a','b','c'};

StringBuffer sb1 = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的数组。

System.out.println(sb1.length());//
sb1.append('a');//value[0] = 'a';
sb1.append('b');//value[1] = 'b';

StringBuffer sb2 = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];

//问题1. System.out.println(sb2.length());//3
//问题2. 扩容问题:如果要添加的数据底层数组盛不下了，那就需要扩容底层的数组
````


默认情况下，扩容为原来容量的2倍 + 2，同时将原数组中的元素复制到新的数组中。

**指导意义：开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)**



##### 3.对比String、StringBuffer、StringBuilder三者的执行效率

从高到低排列：StringBuilder > StringBuffer > String



#### 4.StringBuffer、StringBuilder中的常用方法

增：append(xxx)
删：delete(int start,int end)
改：setCharAt(int n ,char ch) / replace(int start, int end, String str)
查：charAt(int n )
插：insert(int offset, xxx)
长度：length();
遍历：for() + charAt() / toString()









### 9.3 JDK 8 之前的时间日期API

#### 1.获取系统当前时间：

**System类中的currentTimeMillis()**

```
long time = System.currentTimeMillis();
//返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差。
//称为时间戳
System.out.println(time);
```



#### 2. java.util.Date类与java.sql.Date类

![image-20210302142740756](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302142740756.png)



#### 3. java.text.SimpleDataFormat类

![image-20210302143238150](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210302143238150.png)

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304192224031.png" alt="image-20210304192224031" style="zoom:200%;" />





#### 4.Calendar类：日历类、抽象类

    	//1.实例化
        //方式一：创建其子类（GregorianCalendar的对象
        //方式二：调用其静态方法getInstance()
        Calendar calendar = Calendar.getInstance();
        // System.out.println(calendar.getClass());
    
    	//2.常用方法
        //get()
        int days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    
    	//set()
        //calendar可变性
        calendar.set(Calendar.DAY_OF_MONTH,22);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    
    	//add()
        calendar.add(Calendar.DAY_OF_MONTH,-3);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    
    	//getTime():日历类---> Date
        Date date = calendar.getTime();
        System.out.println(date);
    
    	//setTime():Date ---> 日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        days = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);










### 9.4 JDK8之后的时间日期API

#### 1. 日期时间API的迭代：

第一代：jdk 1.0 Date类
第二代：jdk 1.1 Calendar类，一定程度上替换Date类
第三代：jdk 1.8 提出了新的一套API

#### 2. 前两代存在的问题举例：

可变性：像日期和时间这样的类应该是不可变的。
偏移性：Date中的年份是从1900开始的，而月份都从0开始。
格式化：格式化只对Date用，Calendar则不行。
此外，它们也不是线程安全的；不能处理闰秒等。

#### 3. java 8 中新的日期时间API涉及到的包

![image-20210304192905385](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304192905385.png)



#### 4. 本地日期、本地时间、本地日期时间的使用：

**LocalDate / LocalTime / LocalDateTime**

##### 4.1 说明：

① 分别表示使用 ISO-8601日历系统的日期、时间、日期和时间。它们提供了简单的本地日期或时间，并不包含当前的时间信息，也不包含与时区相关的信息。
② LocalDateTime相较于LocalDate、LocalTime，使用频率要高
③ 类似于Calendar

##### 4.2 常用方法：

![image-20210304193039863](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304193039863.png)



#### 5. 时间点：Instant

##### 5.1 说明：

① 时间线上的一个瞬时点。 概念上讲，它只是简单的表示自1970年1月1日0时0分0秒（UTC开始的秒数。）
② 类似于 java.util.Date类

##### 5.2 常用方法：

![image-20210304193124237](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304193124237.png)





#### 6. 日期时间格式化类：DateTimeFormatter

##### 6.1 说明：

① 格式化或解析日期、时间
② 类似于SimpleDateFormat



##### 6.2 常用方法：

① 实例化方式：
预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
本地化相关的格式。如：ofLocalizedDateTime(FormatStyle.LONG)
自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)

② 常用方法：

![image-20210304193316862](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304193316862.png)



![image-20210304193351258](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304193351258.png)



#### 7.其它API的使用 （不讲）

##### 7.1 带时区的日期时间：ZonedDateTime / ZoneId 

```
// ZoneId:类中包含了所的时区信息
  @Test
  public void test1(){
  	//getAvailableZoneIds():获取所的ZoneId
  	Set<String> zoneIds = ZoneId.getAvailableZoneIds();
  	for(String s : zoneIds){
  	System.out.println(s);
  }
  	System.out.println();
		

  //获取“Asia/Tokyo”时区对应的时间
    LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
    System.out.println(localDateTime);		
  }


// ZonedDateTime:带时区的日期时间
  @Test
  public void test2(){
  	//now():获取本时区的ZonedDateTime对象
  	ZonedDateTime zonedDateTime = ZonedDateTime.now();
  	System.out.println(zonedDateTime);
  	//now(ZoneId id):获取指定时区的ZonedDateTime对象
  	ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
  	System.out.println(zonedDateTime1);
  }
```



##### 7.2 时间间隔：Duration--用于计算两个“时间”间隔，以秒和纳秒为基准

```
  @Test
  public void test3(){
  	LocalTime localTime = LocalTime.now();
  	LocalTime localTime1 = LocalTime.of(15, 23, 32);
    // between():静态方法，返回Duration对象，表示两个时间的间隔
    Duration duration = Duration.between(localTime1, localTime);
    System.out.println(duration);
		

	System.out.println(duration.getSeconds());
    System.out.println(duration.getNano());
		
    LocalDateTime localDateTime = LocalDateTime.of(2016, 6, 12, 15, 23, 32);
    LocalDateTime localDateTime1 = LocalDateTime.of(2017, 6, 12, 15, 23, 32);
		
    Duration duration1 = Duration.between(localDateTime1, localDateTime);
	System.out.println(duration1.toDays());	
  }
```



##### 7.3 日期间隔：Period --用于计算两个“日期”间隔，以年、月、日衡量

```
  @Test
  public void test4(){
    LocalDate localDate = LocalDate.now();
    LocalDate localDate1 = LocalDate.of(2028, 3, 18);
		

    Period period = Period.between(localDate, localDate1);
    System.out.println(period);
		
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
		
	Period period1 = period.withYears(2);
    System.out.println(period1);
  }


```



##### 	7.4 日期时间校正器：TemporalAdjuster



















### 9.5 比较器

#### 1. Java比较器的使用背景：

Java中的对象，正常情况下，只能进行比较：==  或  != 。不能使用 > 或 < 的
但是在开发场景中，我们需要对多个对象进行排序，言外之意，就需要比较对象的大小。
如何实现？使用两个接口中的任何一个：Comparable 或 Comparator





#### 2. 自然排序：使用Comparable接口

##### 2.1 说明

![image-20210304194155390](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304194155390.png)



##### 2.2 自定义类代码举例：

```
public class Goods implements  Comparable{

    private String name;
    private double price;
    
   //指明商品比较大小的方式:照价格从低到高排序,再照产品名称从高到低排序
    @Override
    public int compareTo(Object o) {

    	System.out.println("**************");
        if(o instanceof Goods){
            Goods goods = (Goods)o;
            //方式一：
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
//                return 0;
               return -this.name.compareTo(goods.name);
            }
            //方式二：
//           return Double.compare(this.price,goods.price);
        }
//        return 0;
        throw new RuntimeException("传入的数据类型不一致！");
    }
// getter、setter、toString()、构造器：省略
}
```







#### 3. 定制排序：使用Comparator接口

##### 3.1 说明

![image-20210304194454567](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304194454567.png)

##### 3.2 代码举例：

```
Comparator com = new Comparator() {
//指明商品比较大小的方式:照产品名称从低到高排序,再照价格从高到低排序     @Override
  public int compare(Object o1, Object o2) {
  	if(o1 instanceof Goods && o2 instanceof Goods){
    	Goods g1 = (Goods)o1;
        Goods g2 = (Goods)o2;
        if(g1.getName().equals(g2.getName())){
          return -Double.compare(g1.getPrice(),g2.getPrice());
         }else{
           return g1.getName().compareTo(g2.getName());
         }
      }
        throw new RuntimeException("输入的数据类型不一致");
    }
}
```



使用：
Arrays.sort(goods,com);
Collections.sort(coll,com);
new TreeSet(com);





#### 4. 两种排序方式对比

Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小。

Comparator接口属于临时性的比较。











#### 9.5 其他类

##### 1. System类

![image-20210304194815038](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304194815038.png)

##### 2. Math类

java.lang.Math提供了一系列静态方法用于科学计算。其方法的参数和返回值类型一般为double型。



##### 3.BigInteger类、BigDecimal类

说明：
① java.math包的BigInteger可以表示不可变的任意精度的整数。
② 要求数字精度比较高，用到java.math.BigDecimal类

![image-20210304194855526](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304194855526.png)

















## 10. 枚举类和注解

### 10.1 枚举类的使用

#### 1.枚举类的说明

1. 枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类

2. 当需要定义一组常量时，强烈建议使用枚举类

3. 如果枚举类中只一个对象，则可以作为单例模式的实现方式。



#### 2. 如何自定义枚举类？

````
//自定义枚举类
class Season{
  //1.声明Season对象的属性:private final修饰
  private final String seasonName;
  private final String seasonDesc;

  //2.私化类的构造器,并给对象属性赋值
  private Season(String seasonName,String seasonDesc){
    this.seasonName = seasonName;
    this.seasonDesc = seasonDesc;
 }

  //3.提供当前枚举类的多个对象：public static final的
  public static final Season SPRING = new Season("春天","春暖花开");
  public static final Season SUMMER = new Season("夏天","夏日炎炎");
  public static final Season AUTUMN = new Season("秋天","秋高气爽");
  public static final Season WINTER = new Season("冬天","冰天雪地");

  //4.其他诉求1：获取枚举类对象的属性
  public String getSeasonName() {
    return seasonName;
  }

  public String getSeasonDesc() {
    return seasonDesc;
  }
  
  //4.其他诉求1：提供toString()
  @Override
  public String toString() {
    return "Season{" +
           "seasonName='" + seasonName + '\'' +
           ", seasonDesc='" + seasonDesc + '\'' +
           '}';
  }
}
````





#### 3. jdk 5.0 新增使用enum定义枚举类

```
//使用enum关键字枚举类
enum Season1 {
  //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
  SPRING("春天","春暖花开"),
  SUMMER("夏天","夏日炎炎"),
  AUTUMN("秋天","秋高气爽"),
  WINTER("冬天","冰天雪地");

  //2.声明Season对象的属性:private final修饰
  private final String seasonName;
  private final String seasonDesc;

  //2.私化类的构造器,并给对象属性赋值

  private Season1(String seasonName,String seasonDesc){
    this.seasonName = seasonName;
    this.seasonDesc = seasonDesc;
  }

  //4.其他诉求1：获取枚举类对象的属性
  public String getSeasonName() {
    return seasonName;
  }

  public String getSeasonDesc() {
     return seasonDesc;
  }
}
```







#### 4. 使用enum定义枚举类之后，枚举类常用方法

（继承于java.lang.Enum类）

````
  Season1 summer = Season1.SUMMER;
  //toString():返回枚举类对象的名称
  System.out.println(summer.toString());

  //System.out.println(Season1.class.getSuperclass());
  System.out.println("****************");
  //values():返回所的枚举类对象构成的数组
  Season1[] values = Season1.values();
  
  for(int i = 0;i < values.length;i++){
    System.out.println(values[i]);
  }
  System.out.println("****************");
  Thread.State[] values1 = Thread.State.values();
  for (int i = 0; i < values1.length; i++) {
    System.out.println(values1[i]);
  }

  //valueOf(String objName):返回枚举类中对象名是objName的对象。
  Season1 winter = Season1.valueOf("WINTER");
  //如果没objName的枚举类对象，则抛异常：IllegalArgumentException

  //Season1 winter = Season1.valueOf("WINTER1");
  System.out.println(winter);
````





#### 5. 使用enum定义枚举类之后，如何让枚举类对象分别实现接口

```
interface Info{
 void show();
}

//使用enum关键字枚举类
enum Season1 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };
}
```









### 10.2 注解的使用

#### 1. 注解的理解

![image-20210304200140280](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304200140280.png)

#### 2. 注解的使用实例

![image-20210304200229542](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304200229542.png)



#### 3. 如何自定义注解

参考@supperssWarnings 定义

#### <img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304200423390.png" alt="image-20210304200423390" style="zoom:80%;" /><img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304200613900.png" alt="image-20210304200613900" style="zoom:80%;" />



```
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}
```



#### 4. 元注解：对现有的注解进行解释说明的注解

![image-20210304200828321](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304200828321.png)





#### 5. 如何获取注解信息：通过发射来进行获取，调用

前提：要求此注解的元注解retention中声明了声明周期状态为runtime



#### 6. JDK8 中注解的新特性：可重复注解、类型注解

![image-20210304201037523](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210304201037523.png)















## 11. 集合

### 11.1 数组与集合

#### 1. 集合与数组存储数据概述：

集合、数组都是对多个数据进行存储操作的结构，简称Java容器。
说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt,.jpg,.avi，数据库中)



#### 2. 数组存储的特点：

一旦初始化以后，其长度就确定了
数组一旦定义好，其元素的类型也就确定了。我们也就只能操作指定类型的数据了

比如：String[] arr;int[] arr1;Object[] arr2;



#### 3. 数组存储的弊端：

![image-20210305153956680](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305153956680.png)

####  4. 集合存储的优点：

解决数组存储数据方面的弊端









### 11.2  collection接口

#### 1. 单列集合框架结构

|----Collection接口：单列集合，用来存储一个一个的对象

​			|----List接口：存储序的、可重复的数据。  -->“动态”数组

​						|----ArrayList、LinkedList、Vector


​			|----Set接口：存储无序的、不可重复的数据   -->高中讲的“集合”

​						|----HashSet、LinkedHashSet、TreeSet




![image-20210305154148541](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305154148541.png)





#### 2. Collection接口常用方法：

add(Object obj),addAll(Collection coll),size(),isEmpty(),clear();
contains(Object obj),containsAll(Collection coll),remove(Object obj),removeAll(Collection coll),retainsAll(Collection coll),equals(Object obj);
hasCode(),toArray(),iterator();



#### 3. Collection集合与数组间的转换

![image-20210305154241644](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305154241644.png)



#### 4.使用Collection集合存储对象，要求对象所属的类满足：

向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals().





##### 5.本章节对大家的要求：

层次一：选择合适的集合类去实现数据的保存，调用其内部的相关方法。

层次二：不同的集合类底层的数据结构为何？如何实现数据的操作的：增删改查等。









### 11.3 Iterator 接口与 foreach

#### 1.遍历Collection的两种方式：

① 使用迭代器Iterator  ② foreach循环（或增强for循环）

#### 2.java.utils包下定义的迭代器接口：Iterator

##### 2.1 说明：

![image-20210305154437028](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305154437028.png)



##### 2.2 作用：

遍历集合Collectiton元素



##### 2.3 如何获取实例：

coll.iterator()返回一个迭代器实例



##### 2.4 遍历的代码实现：

```
Iterator iterator = coll.iterator();
//hasNext():判断是否还下一个元素
while(iterator.hasNext()){
    //next():①指针下移 ②将下移以后集合位置上的元素返回
    System.out.println(iterator.next());
}
```



##### 2.5图示说明：

![](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305154510384.png)



##### 2.6 remove()的使用：

![image-20210305154703162](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305154703162.png)

```
 @Test
 public void test3(){
   Collection coll = new ArrayList();
   coll.add(123);
   coll.add(456);
   coll.add(new Person("Jerry",20));
   coll.add(new String("Tom"));
   coll.add(false);

   //删除集合中"Tom"
   Iterator iterator = coll.iterator();
   while (iterator.hasNext()){
   
     //iterator.remove();
     Object obj = iterator.next();
     if("Tom".equals(obj)){
       iterator.remove();
       //iterator.remove();
      }
  }
  //遍历集合
  iterator = coll.iterator();
  while (iterator.hasNext()){
    System.out.println(iterator.next());
  }
}
```



#### 3. jDK5.0新特性--增强for循环：(foreach循环)

##### 1.遍历集合举例：

```
@Test
public void test1(){
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add(456);
    coll.add(new Person("Jerry",20));
    coll.add(new String("Tom"));
    coll.add(false);

    //for(集合元素的类型 局部变量 : 集合对象)
    
    for(Object obj : coll){
        System.out.println(obj);
    }
}
```


说明：内部仍然调用了迭代器。



##### 2.遍历数组举例：

```
@Test
public void test2(){
    int[] arr = new int[]{1,2,3,4,5,6};
    //for(数组元素的类型 局部变量 : 数组对象)
    for(int i : arr){
        System.out.println(i);
    }
}
```





### 11.4 collection 子接口：List接口

#### 1. 存储的数据特点：

存储序的、可重复的数据。

#### 2. 常用方法：(记住)

增：add(Object obj)
删：remove(int index) / remove(Object obj)
改：set(int index, Object ele)
查：get(int index)
插：add(int index, Object ele)
长度：size()
遍历：① Iterator迭代器方式
  ② 增强for循环
  ③ 普通的循环



#### 3. 常用实现类：

|----Collection接口：单列集合，用来存储一个一个的对象

​		|----List接口：存储序的、可重复的数据。  -->“动态”数组,替换原的数组

​				|----ArrayList：作为List接口的主要实现类；线程不安全的，效率高；底     											层使用Object[] elementData存储

​				|----LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList												高；底层使用双向链表存储

​				|----Vector：作为List接口的古老实现类；线程安全的，效率低；底层使										用Object[] elementData存储



#### 4. 源码分析(难点)

##### 4.1 ArrayList的源码分析：![image-20210305155637896](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305155637896.png)



##### 4.2 LinkedList的源码分析：

![image-20210305155716484](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305155716484.png)



##### 4.3 Vector的源码分析：

jdk7和jdk8中通过Vector()构造器创建对象时，底层都创建了长度为10的数组。
在扩容方面，默认扩容为原来的数组长度的2倍。





#### 5. 存储的元素的要求：

添加的对象，所在的类要重写equals()方法

[面试题]

面试题：ArrayList、LinkedList、Vector者的异同？

同：三个类都是实现了List接口，存储数据的特点相同：存储序的、可重复的数据

不同：见上（第3部分+第4部分）













### 11.5 collection子接口：Set接口

#### 1. 存储的数据特点: 无序的、不可重复的元素

![image-20210305155944419](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305155944419.png)



#### 2. 元素添加过程：(以HashSet为例)

![image-20210305160015042](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305160015042.png)



#### 3. 常用方法

Set接口中没额外定义新的方法，使用的都是Collection中声明过的方法。



#### 4. 常用实现类：

|----Collection接口：单列集合，用来存储一个一个的对象

​			|----Set接口：存储无序的、不可重复的数据   -->高中讲的“集合”

​						|----HashSet：作为Set接口的主要实现类；线程不安全的；可以存储													null值

​						|----LinkedHashSet：作为HashSet的子类；遍历其内部数据时，可以																按照添加的顺序遍历

​						在添加数据的同时，每个数据还维护了两个引用，记录此数据前一个						数据和后一个数据. 对于频繁的遍历操作，LinkedHashSet效率高于						HashSet.

​						|----TreeSet：可以照添加对象的指定属性，进行排序。





#### 5. 存储对象所在类的要求：

![](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210305160233647.png)

比较hashcode，再比较内容

#### 6. TreeSet的使用

##### 6.1 使用说明:

1.向TreeSet中添加的数据，要求是相同类的对象。
2.两种排序方式：自然排序（实现Comparable接口 和 定制排序（Comparator）



##### 6.2 常用的排序方式:

````
//方式一：自然排序
@Test
    public void test1(){
        TreeSet set = new TreeSet();

        //失败：不能添加不同类的对象

//        set.add(123);
//        set.add(456);
//        set.add("AA");
//        set.add(new User("Tom",12));

            //举例一：

//        set.add(34);
//        set.add(-34);
//        set.add(43);
//        set.add(11);
//        set.add(8);

        //举例二：
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    
    }


````

````
//方式二：定制排序
    @Test
    public void test2(){
      Comparator com = new Comparator() {
      //照年龄从小到大排列
      @Override
      public int compare(Object o1, Object o2) {
        if(o1 instanceof User && o2 instanceof User){
          User u1 = (User)o1;
          User u2 = (User)o2;
          return Integer.compare(u1.getAge(),u2.getAge());
        }else{
          throw new RuntimeException("输入的数据类型不匹配");
        }
     }
   };

        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Jerry",32));
        set.add(new User("Jim",2));
        set.add(new User("Mike",65));
        set.add(new User("Mary",33));
        set.add(new User("Jack",33));
        set.add(new User("Jack",56));


        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
````







### 11.6 Map 接口

双列集合框架：Map

#### 1. 常用实现类结构

![image-20210306191039286](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191039286.png)



#### 2. 存储结构的理解：

![image-20210306191110014](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191110014.png)

![image-20210306191115695](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191115695.png)

#### 3. 常用方法

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191146090.png" alt="image-20210306191146090" style="zoom: 80%;" />



#### 4. 内存结构说明：（难点）

##### 4.1 HashMap在jdk7中实现原理：

![image-20210306191243526](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191243526.png)



##### 4.2 HashMap在jdk8中相较于jdk7在底层实现方面的不同：

![image-20210306191313103](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191313103.png)





##### 4.3 HashMap底层典型属性的属性的说明：

DEFAULT_INITIAL_CAPACITY : HashMap的默认容量，16
DEFAULT_LOAD_FACTOR：HashMap的默认加载因子：0.75
threshold：扩容的临界值，=容量*填充因子：16 * 0.75 => 12
TREEIFY_THRESHOLD：Bucket中链表长度大于该默认值，转化为红黑树:8
MIN_TREEIFY_CAPACITY：桶中的Node被树化时最小的hash表容量:64



##### 4.4 LinkedHashMap的底层实现原理(了解)

![image-20210306191601215](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191601215.png)



#### 5. TreeMap的使用

//向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
//因为要照key进行排序：自然排序 、定制排序



#### 6. 使用Properties读取配置文件











### 11.7 collections 工具类

Collections工具类

#### 1.作用：操作Collection和Map的工具类

#### 2.常用方法：

![image-20210306191805412](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191805412.png)

![image-20210306191819043](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210306191819043.png)

##### 说明：ArrayList和HashMap都是线程不安全的，如果程序要求线程安全，我们可以将ArrayList、HashMap转换为线程的。

##### 使用synchronizedList(List list） 和 synchronizedMap(Map map）



#### 3.面试题：

面试题：Collection 和 Collections的区别？







## 12. 泛型

### 12.1 泛型在集合中的使用

#### 1. 在集合中使用泛型之前的例子

```
 @Test
 public void test1(){
     ArrayList list = new ArrayList();
     //需求：存放学生的成绩
     list.add(78);
     list.add(76);
     list.add(89);
     list.add(88);
     // 问题一：类型不安全
     // list.add("Tom");


     for(Object score : list){
     //问题二：强转时，可能出现ClassCastException
     int stuScore = (Integer) score;
     
     System.out.println(stuScore);
	}
 }
```

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210307171822084.png" alt="image-20210307171822084" style="zoom:80%;" />

#### 2. 在集合中使用泛型例子1

````
 @Test
 public void test2(){
    ArrayList<Integer> list =  new ArrayList<Integer>();
    list.add(78);
    list.add(87);
    list.add(99);
    list.add(65);
    //编译时，就会进行类型检查，保证数据的安全
	// list.add("Tom");

 	//方式一：
       for(Integer score : list){
       //避免了强转操作
       //int stuScore = score;
  
         system.out.println(stuScore);
        }
     
     //方式二：
     Iterator<Integer> iterator = list.iterator();
     while(iterator.hasNext()){
         int stuScore = iterator.next();
         System.out.println(stuScore);
     }
 }
````

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210307172119796.png" alt="image-20210307172119796" style="zoom:80%;" />



#### 3. 在集合中使用泛型例子2



````
 @Test
 public void test3(){
     //Map<String,Integer> map = new HashMap<String,Integer>();
     //jdk7新特性：类型推断
     Map<String,Integer> map = new HashMap<>();

	 map.put("Tom",87);
     map.put("Jerry",87);
 	 map.put("Jack",67);


     //map.put(123,"ABC");
     //泛型的嵌套
     Set<Map.Entry<String,Integer>> entry = map.entrySet();
     Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();

     while(iterator.hasNext()){
         Map.Entry<String, Integer> e = iterator.next();
         String key = e.getKey();
         Integer value = e.getValue();
         System.out.println(key + "----" + value);
     }
 }
````



#### 4. 集合中使用泛型总结：

① 集合接口或集合类在jdk5.0时都修改为带泛型的结构。

② 在实例化集合类时，可以指明具体的泛型类型

③ 指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型。

比如：add(E e)  --->实例化以后：add(Integer e)

④ 注意点：泛型的类型必须是类，不能是基本数据类型。需要用到基本数据类型的位置，拿包装类替换

⑤ 如果实例化时，没指明泛型的类型。默认类型为java.lang.Object类型。



#### 12. 1. 1  泛型的理解

##### 1.泛型的概念

所谓泛型，就是允许在定义类、接口时通过一个标识表示类中某个属性的类型或者是某个方法的返
回值及参数类型。这个类型参数将在使用时（例如，继承或实现这个接口，用这个类型声明变量、
创建对象时确定（即传入实际的类型参数，也称为类型实参）。

##### 2.泛型的引入背景

集合容器类在设计阶段/声明阶段不能确定这个容器到底实际存的是什么类型的对象，所以在JDK1.5之前只能把元素类型设计为Object，JDK1.5之后使用泛型来解决。因为这个时候除了元素的类型不确定，其他的部分是确定的，例如关于这个元素如何保存，如何管理等是确定的，因此此时把元素的类型设计成一个参数，这个类型参数叫做泛型。Collection<E>，List<E>，ArrayList<E>   这个<E>就是类型参数，即泛型。







### 12.2 自定义泛型类、泛型接口、泛型方法

语雀代码

#### 2. 注意

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210307173054201.png" alt="image-20210307173054201" style="zoom:80%;" />

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210307173134597.png" alt="image-20210307173134597" style="zoom:80%;" />

#### 3. 应用场景举例

语雀. 练习





### 12.3 泛型在继承上的体现

1.泛型在继承方面的体现

   虽然类A是类B的父类，但是G<A> 和G<B>二者不具备子父类关系，二者是并列关系。

   补充：类A是类B的父类，A<G> 是 B<G> 的父类



### 12.4 通配符

#### 1. 通配符的使用

​      通配符：?

​       类A是类B的父类，G<A>和G<B>是没关系的，二者共同的父类是：G<?>

#### 2. 涉及通配符集合数据的写入和读取

````
    // 在集合中使用泛型的情况：以 ArrayList
    @Test
    public void test2() {
        ArrayList<Integer> integers = new ArrayList<Integer>();    // 不能用基本数据类型，要用包装类
        // JDK 7 新特性，类型推断
        ArrayList<Integer> integers1 = new ArrayList<>();    // 不能用基本数据类型，要用包装类

        integers.add(123);
        integers.add(234);
        // integers.add("AA");   编译过不去
        integers.add(0);

        for (Integer score : integers) {
            System.out.println(score);
        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
````



#### 3. 有限制条件的通配符的使用


​    ? extends Person：只允许泛型为Person及Person子类的引用调用  # <=  (无穷小，Person]
​    ? super Person： 只允许泛型为Person及Person父类的引用调用  # >=  [Person，无穷大]

















## 13. IO流

### 13.1 File 类的使用

#### 1. File类的理解

![image-20210309160743381](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309160743381.png)



#### 2. File的实例化

##### 2.1 常用构造器

File(String filePath)
File(String parentPath,String childPath)
File(File parentFile,String childPath)



##### 2.2 路径的分类

相对路径：相较于某个路径下，指明的路径。
绝对路径：包含盘符在内的文件或文件目录的路径

说明：
IDEA中：如果大家开发使用JUnit中的单元测试方法测试，相对路径即为当前Module下。
					如果大家使用main()测试，相对路径即为当前的Project下。

Eclipse中：
不管使用单元测试方法还是使用main()测试，相对路径都是当前的Project下。



#### 2.3 路径分隔符

windows和DOS系统默认使用“\”来表示
UNIX和URL使用“/”来表示

#### 3. File类的常用方法

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309160901478.png" alt="image-20210309160901478" style="zoom: 67%;" />

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309160957606.png" alt="image-20210309160957606" style="zoom: 67%;" />

**注意事项：如果你创建文件或文件目录没有写盘符路径，那么默认在项目路径下**

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309161031858.png" alt="image-20210309161031858" style="zoom: 67%;" />











### 13.2 IO 概述

#### 1.流的分类

1. 操作数据单位：字节流、字符流

2. 数据的流向：输入流、输出流

3. 流的角色：节点流、处理流

![image-20210309161249739](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309161249739.png)



#### 2. 流的体系结构

#### ![image-20210309161306111](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309161306111.png)



说明：红框对应的是IO流中的4个抽象基类。
蓝框的流需要大家重点关注。



#### 3.重点说明的几个流结构

![image-20210309161334192](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309161334192.png)



#### 4.输入、输出的标准化过程

##### 4.1 输入过程

①  创建File类的对象，指明读取的数据的来源。（要求此文件一定要存在）
②  创建相应的输入流，将File类的对象作为参数，传入流的构造器中
③  具体的读入过程：
       创建相应的byte[] 或 char[]。
④ 关闭流资源

说明：程序中出现的异常需要使用try-catch-finally处理。



##### 4.2 输出过程

①  创建File类的对象，指明写出的数据的位置。（不要求此文件一定要存在）
②  创建相应的输出流，将File类的对象作为参数，传入流的构造器中
③  具体的写出过程：
       write(char[]/byte[] buffer,0,len)
④  关闭流资源

说明：程序中出现的异常需要使用try-catch-finally处理。









### 13.3 节点流

#### 1.FileReader/FileWriter的使用：

##### 1.1 FileReader的使用

1. read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1

2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用try-catch-finally处理

3. 读入的文件一定要存在，否则就会报FileNotFoundException

   

```
@Test
public void testFileWriter() {
    FileWriter fw = null;
    try {
        //1.提供File类的对象，指明写出到的文件
        File file = new File("hello1.txt");

        //2.提供FileWriter的对象，用于数据的写出
        fw = new FileWriter(file,false);

        //3.写出的操作
        fw.write("I have a dream!\n");
        fw.write("you need to have a dream!");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        //4.流资源的关闭
        if(fw != null){

            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```



##### 1.2 FileWriter的使用

![image-20210309162259088](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309162259088.png)



##### 1.3 文本文件的复制：

````
    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //不能使用字符流来处理图片等字节数据

//            File srcFile = new File("爱情与友情.jpg");
//            File destFile = new File("爱情与友情1.jpg");


            //2.创建输入流和输出流的对象
             fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);


            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读入到cbuf数组中的字符的个数
            while((len = fr.read(cbuf)) != -1){
                //每次写出len个字符
                fw.write(cbuf,0,len);
    
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭流资源
            //方式一：

//            try {
//                if(fw != null)
//                    fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally{
//                try {
//                    if(fr != null)
//                        fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式二：
            try {
                if(fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
````



####    2.FileInputStream / FileOutputStream的使用：

1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理

2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理

   // 实现对图片的复制操作

````
@Test
public void testFileInputOutputStream()  {
    FileInputStream fis = null;
    FileOutputStream fos = null;
    try {
        //1.造文件
        File srcFile = new File("爱情与友情.jpg");
        File destFile = new File("爱情与友情2.jpg");

        //2.造流
        fis = new FileInputStream(srcFile);
        fos = new FileOutputStream(destFile);

        //3.复制的过程
        byte[] buffer = new byte[5];
        int len;
        while((len = fis.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }

    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if(fos != null){
            //4.关闭流
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(fis != null){
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
````



**注意**
相对路径在IDEA和Eclipse中使用的区别？

IDEA:  如果使用单元测试方法，相对路径基于当前的Module的。
			 如果使用main()测试，相对路径基于当前Project的。

Eclipse:
单元测试方法还是main(),相对路径都是基于当前Project的。

















### 13.4 缓存流

#### 1. 缓冲流涉及到的类

​	BufferedInputStream

​    BufferedOutputStream

​    BufferedReader

​    BufferedWriter



#### 2.作用：

作用：提供流的读取、写入的速度
提高读写速度的原因：内部提供了一个缓冲区。默认情况下是8kb

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309163034838.png" alt="image-20210309163034838" style="zoom:67%;" />





#### 3.典型代码

##### 3.1 使用BufferedInputStream和BufferedOutputStream:处理非文本文件




       //实现文件复制的方法
        public void copyFileWithBuffered(String srcPath,String destPath){
            BufferedInputStream bis = null;
            BufferedOutputStream bos = null;
       try {
            //1.造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);
            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream((srcFile));
            FileOutputStream fos = new FileOutputStream(destFile);
            //2.2 造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
    
            //3.复制的细节：读取、写入
            byte[] buffer = new byte[1024];
            int len;
            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭
            //要求：先关闭外层的流，再关闭内层的流
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    
            }
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
    
            }
        //说明：关闭外层流的同时，内层流也会自动的进行关闭。关于内层流的关闭，我们可以省略.


##### 3.2 使用BufferedReader和BufferedWriter：处理文本文件

````
    @Test
    public void testBufferedReaderBufferedWriter(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("dbcp.txt")));
            bw = new BufferedWriter(new FileWriter(new File("dbcp1.txt")));

            //读写操作
            //方式一：使用char[]数组

//            char[] cbuf = new char[1024];
//            int len;
//            while((len = br.read(cbuf)) != -1){
//                bw.write(cbuf,0,len);
//                bw.flush();
//            }

            /
            /方式二：使用String
            String data;
            while((data = br.readLine()) != null){
                //方法一：

//                bw.write(data + "\n");//data中不包含换行符
                //方法二：
                bw.write(data);//data中不包含换行符
                bw.newLine();//提供换行的操作
            }
        } catch (IOException e) {
        	e.printStackTrace();
    	} finally {
        //关闭资源
        	if(bw != null){
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(br != null){
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
````



​	







### 13.5 转换流

#### 1. 转换流涉及到的类：属于字符流

InputStreamReader：将一个字节的输入流转换为字符的输入流
解码：字节、字节数组  --->字符数组、字符串

OutputStreamWriter：将一个字符的输出流转换为字节的输出流
编码：字符数组、字符串 ---> 字节、字节数组

说明：编码决定了解码的方式



#### 2. 作用

提供字节流与字符流之间的转换

#### 3. 图示

![image-20210309163551899](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210309163551899.png)



#### 4. 典型实现：

```
	@Test
    public void test1() throws IOException {

        FileInputStream fis = new FileInputStream("dbcp.txt");

//      InputStreamReader isr = new InputStreamReader(fis);//使用系统默认的字符集
        //参数2指明了字符集，具体使用哪个字符集，取决于文件dbcp.txt保存时使用的字符集
        InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//使用系统默认的字符集

        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String str = new String(cbuf,0,len);
            System.out.print(str);
        }
    
        isr.close(); 
    }


/*
此时处理异常的话，仍然应该使用try-catch-finally

综合使用InputStreamReader和OutputStreamWriter
 */
    @Test
    public void test2() throws Exception {
        //1.造文件、造流
        File file1 = new File("dbcp.txt");
        File file2 = new File("dbcp_gbk.txt");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        InputStreamReader isr = new InputStreamReader(fis,"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");

        //2.读写过程
        char[] cbuf = new char[20];
        int len;
        while((len = isr.read(cbuf)) != -1){
            osw.write(cbuf,0,len);
        }

        //3.关闭资源
        isr.close();
        osw.close();
    }
```



#### 5.说明

//文件编码的方式（比如：GBK），决定了解析时使用的字符集（也只能是GBK）。



#### 13.5.1 编码集

##### 1. 常见的编码表

![image-20210310144937552](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310144937552.png)



##### 2. 对后面学习的启示

客户端/浏览器端   <--->   后台 (java,go,python,node.js,php)   <---> 数据库 

要求前前后后使用的字符集都要统一：UTF-8

















### 13.6 其他流的使用

#### 1. 标准的输入输出流：

System.in:标准的输入流，默认从键盘输入
System.out:标准的输出流，默认从控制台输出

修改默认的输入和输出行为：
System类的setIn(InputStream is) / setOut(PrintStream ps)方式重新指定输入和输出的流。



#### 2. 打印流：

PrintStream 和PrintWriter
说明： 提供了一系列重载的print()和println()方法，用于多种数据类型的输出
			  System.out返回的是PrintStream的实例



#### 3. 数据流：

DataInputStream 和 DataOutputStream
作用：用于读取或写出基本数据类型的变量或字符串



```
示例代码：
/*
练习：将内存中的字符串、基本数据类型的变量写出到文件中。

注意：处理异常的话，仍然应该使用try-catch-finally.
 */
@Test
public void test3() throws IOException {
    //1.
    DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));
    //2.
    dos.writeUTF("刘建辰");
    dos.flush();//刷新操作，将内存中的数据写入文件
    dos.writeInt(23);
    dos.flush();
    dos.writeBoolean(true);
    dos.flush();
    //3.
    dos.close();
}


/*
将文件中存储的基本数据类型变量和字符串读取到内存中，保存在变量中。

注意点：读取不同类型的数据的顺序要与当初写入文件时，保存的数据的顺序一致！

 */
@Test
public void test4() throws IOException {
    //1.
    DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));
    //2.
    String name = dis.readUTF();
    int age = dis.readInt();
    boolean isMale = dis.readBoolean();

    System.out.println("name = " + name);
    System.out.println("age = " + age);
    System.out.println("isMale = " + isMale);
    
    //3.
    dis.close();
}
```











### 13.7 对象流

#### 1. 对象流

ObjectInputStream 和 ObjectOutputStream



#### 2. 作用

ObjectOutputStream: 内存中的对象--->存储中的文件、通过网络传输出去：序列化过程
ObjectInputStream: 存储中的文件、通过网络接收过来 --->内存中的对象：反序列化过程

#### 3.对象的序列化机制

![image-20210310145339293](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310145339293.png)



#### 4. 序列化代码实现

```
@Test
public void testObjectOutputStream(){
    ObjectOutputStream oos = null;

    try {
        //1.
        oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
        //2.
        oos.writeObject(new String("我爱北京天安门"));
        oos.flush();//刷新操作
    
         oos.writeObject(new Person("王铭",23));
        oos.flush();
    
        oos.writeObject(new Person("张学良",23,1001,new Account(5000)));
        oos.flush();
    
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if(oos != null){
            //3.
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }
    }
}
```





#### 5. 反序列化代码实现

```
@Test
public void testObjectInputStream(){
    ObjectInputStream ois = null;
    try {
        ois = new ObjectInputStream(new FileInputStream("object.dat"));

        Object obj = ois.readObject();
        String str = (String) obj;
    
        Person p = (Person) ois.readObject();
        Person p1 = (Person) ois.readObject();
    
        System.out.println(str);
        System.out.println(p);
        System.out.println(p1);
    
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } finally {
        if(ois != null){
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```





#### 6. 实现序列化的对象所属的类需要满足

#####   1. 需要实现接口：Serializable

#####   2.当前类提供一个全局常量：serialVersionUID

#####   3.除了当前Person类需要实现Serializable接口之外，还必须保证其内部所属性

​      也必须是可序列化的。（默认情况下，基本数据类型可序列化）


##### 补充：ObjectOutputStream和ObjectInputStream不能序列化static和transient修饰的成员变量















### 13.8 RandomAccessFile 

#### 1. 随机存取文件流

RandomAccessFile

#### 2. 使用说明

![image-20210310145726654](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310145726654.png)



#### 3. 典型代码1

```
@Test
public void test1() {

    RandomAccessFile raf1 = null;
    RandomAccessFile raf2 = null;
    try {
        //1.
        raf1 = new RandomAccessFile(new File("爱情与友情.jpg"),"r");
        raf2 = new RandomAccessFile(new File("爱情与友情1.jpg"),"rw");
        //2.
        byte[] buffer = new byte[1024];
        int len;
        while((len = raf1.read(buffer)) != -1){
            raf2.write(buffer,0,len);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        //3.
        if(raf1 != null){
            try {
                raf1.close();
            } catch (IOException e) {
                e.printStackTrace();
            } 
        }
        if(raf2 != null){
            try {
                raf2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
```





**典型代码2：**

使用RandomAccessFile实现数据的插入效果

```
@Test
public void test3() throws IOException {

    RandomAccessFile raf1 = new RandomAccessFile("hello.txt","rw");
    
    raf1.seek(3);//将指针调到角标为3的位置
    //保存指针3后面的所数据到StringBuilder中
    StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
    byte[] buffer = new byte[20];
    int len;
    while((len = raf1.read(buffer)) != -1){
        builder.append(new String(buffer,0,len)) ;
    }
    //调回指针，写入“xyz”
    raf1.seek(3);
    raf1.write("xyz".getBytes());
    
    //将StringBuilder中的数据写入到文件中
    raf1.write(builder.toString().getBytes());
    
    raf1.close();
    
    //思考：将StringBuilder替换为ByteArrayOutputStream
}
```











### 13.9 Path / Paths / Files 

#### 1. NIO的使用说明

Java NIO (New IO，Non-Blocking IO)是从Java 1.4版本开始引入的一套新的IO API，可以替代标准的Java  IO AP。

NIO与原来的IO同样的作用和目的，但是使用的方式完全不同，NIO支持面向缓冲区的(IO是面向流的)、基于
通道的IO操作。

**NIO将以更加高效的方式进行文件的读写操作。**
随着 JDK 7 的发布，Java对NIO进行了极大的扩展，增强了对文件处理和文件系统特性的支持，以至于我们称他们为 NIO.2。

#### 2. Path的使用 ---jdk7提供

##### 2.1Path的说明

Path替换原有的File类。



##### 2.2如何实例化

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310150316481.png" alt="image-20210310150316481" style="zoom:67%;" />



##### 2.3常用方法

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310150348164.png" alt="image-20210310150348164" style="zoom:80%;" />



#### 3.Files工具类 ---jdk7提供

##### 3.1作用

操作文件或文件目录的工具类

##### 3.2常用方法

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310150434351.png" alt="image-20210310150434351" style="zoom:80%;" />

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310150452264.png" alt="image-20210310150452264" style="zoom:80%;" />

















## 14. 网络编程

### 14.1 InetAddress 类的使用

#### 1. 实现网络通信需要解决的两个问题

​    1.如何准确地定位网络上一台或多台主机；定位主机上的特定的应用

​     2.找到主机后如何可靠高效地进行数据传输



#### 2. 网络通信的两个要素：

​    1.对应问题一：IP和端口号

​    2.对应问题二：提供网络通信协议：TCP/IP参考模型（应用层、传输层、网络层、物理+数据链路层）



#### 3. 通信要素一：IP和端口号

##### 1. IP的理解

1. IP:唯一的标识 Internet 上的计算机（通信实体）

2. 在Java中使用InetAddress类代表IP

3. IP分类：IPv4 和 IPv6 ; 万维网 和 局域网

4. 域名:   www.baidu.com   www.mi.com  www.sina.com  www.jd.com


域名解析：域名容易记忆，当在连接网络时输入一个主机的域名后，域名服务器(DNS)负责将域名转化成IP地址，这样才能和主机建立连接。 -------域名解析

5. 本地回路地址：127.0.0.1 对应着：localhost
   



#### 2.InetAddress类

此类的一个对象就代表着一个具体的IP地址

##### 2.1实例化

getByName(String host) 、 getLocalHost()

##### 2.2 常用方法

getHostName() / getHostAddress()



#### 3. 端口号：正在计算机上运行的进程。

​      要求：不同的进程不同的端口号

​      范围：被规定为一个 16 位的整数 0~65535。

端口号与IP地址的组合得出一个网络套接字：Socket



#### 4. 通信要素二：网络通信协议

##### 1. 分型模型

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310151011057.png" alt="image-20210310151011057" style="zoom:80%;" />



##### 2.TCP和UDP的区别

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310151041297.png" alt="image-20210310151041297" style="zoom:67%;" />



##### 3.TCP三次握手和四次挥手

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310151101126.png" alt="image-20210310151101126" style="zoom:67%;" /><img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310151109772.png" alt="image-20210310151109772" style="zoom:67%;" />

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310151109772.png" alt="image-20210310151109772" style="zoom:67%;" />











### 14.2 TCP 网络编程

代码示例1：客户端发送信息给服务端，服务端将数据显示在控制台上

```
    //客户端
    @Test
    public void client()  {
        Socket socket = null;
        OutputStream os = null;
        try {
            //1.创建Socket对象，指明服务器端的ip和端口号
            InetAddress inet = InetAddress.getByName("192.168.14.100");
            socket = new Socket(inet,8899);
            //2.获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //3.写出数据的操作
            os.write("你好，我是客户端mm".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源的关闭
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }
    }
    //服务端
    @Test
    public void server()  {

        ServerSocket ss = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ss = new ServerSocket(8899);
            //2.调用accept()表示接收来自于客户端的socket
            socket = ss.accept();
            //3.获取输入流
            is = socket.getInputStream();

            //不建议这样写，可能会乱码
            
//          byte[] buffer = new byte[1024];
//          int len;
//          while((len = is.read(buffer)) != -1){
//              String str = new String(buffer,0,len);
//              System.out.print(str);
//          }
            
            //4.读取输入流中的数据
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[5];
            int len;
            while((len = is.read(buffer)) != -1){
                baos.write(buffer,0,len);
            }

            System.out.println(baos.toString());
    
            System.out.println("收到了来自于：" + socket.getInetAddress().getHostAddress() + "的数据");
    
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(baos != null){
                //5.关闭资源
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
```







代码示例2：客户端发送文件给服务端，服务端将文件保存在本地

```
@Test
public void client() throws IOException {
    //1.
    Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
    //2.
    OutputStream os = socket.getOutputStream();
    //3.
    FileInputStream fis = new FileInputStream(new File("beauty.jpg"));
    //4.
    byte[] buffer = new byte[1024];
    int len;
    while((len = fis.read(buffer)) != -1){
        os.write(buffer,0,len);
    }
    //5.
    fis.close();
    os.close();
    socket.close();
}

/*
这里涉及到的异常，应该使用try-catch-finally处理
 */
@Test
public void server() throws IOException {
    //1.
    ServerSocket ss = new ServerSocket(9090);
    //2.
    Socket socket = ss.accept();
    //3.
    InputStream is = socket.getInputStream();
    //4.
    FileOutputStream fos = new FileOutputStream(new File("beauty1.jpg"));
    //5.
    byte[] buffer = new byte[1024];
    int len;
    while((len = is.read(buffer)) != -1){
        fos.write(buffer,0,len);
    }
    //6.
    fos.close();
    is.close();
    socket.close();
    ss.close();
}
```



代码示例3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。

```
@Test
public void client() throws IOException {
    //1.
    Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
    //2.
    OutputStream os = socket.getOutputStream();
    //3.
    FileInputStream fis = new FileInputStream(new File("beauty.jpg"));
    //4.
    byte[] buffer = new byte[1024];
    int len;
    while((len = fis.read(buffer)) != -1){
        os.write(buffer,0,len);
    }
    //关闭数据的输出
    socket.shutdownOutput();

    //5.接收来自于服务器端的数据，并显示到控制台上
    InputStream is = socket.getInputStream();
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    byte[] bufferr = new byte[20];
    int len1;
    while((len1 = is.read(buffer)) != -1){
        baos.write(buffer,0,len1);
    }
    
    System.out.println(baos.toString());
    
    //6.
    fis.close();
    os.close();
    socket.close();
    baos.close();
}
/*
这里涉及到的异常，应该使用try-catch-finally处理
 */
@Test
public void server() throws IOException {
    //1.
    ServerSocket ss = new ServerSocket(9090);
    //2.
    Socket socket = ss.accept();
    //3.
    InputStream is = socket.getInputStream();
    //4.
    FileOutputStream fos = new FileOutputStream(new File("beauty2.jpg"));
    //5.
    byte[] buffer = new byte[1024];
    int len;
    while((len = is.read(buffer)) != -1){
        fos.write(buffer,0,len);
    }

    System.out.println("图片传输完成");
    
    //6.服务器端给予客户端反馈
    OutputStream os = socket.getOutputStream();
    os.write("你好，美女，照片我已收到，非常漂亮！".getBytes());
    
    //7.
    fos.close();
    is.close();
    socket.close();
    ss.close();
    os.close();

}

/*
这里涉及到的异常，应该使用try-catch-finally处理
 */
@Test
public void server() throws IOException {
    //1.
    ServerSocket ss = new ServerSocket(9090);
    //2.
    Socket socket = ss.accept();
    //3.
    InputStream is = socket.getInputStream();
    //4.
    FileOutputStream fos = new FileOutputStream(new File("beauty2.jpg"));
    //5.
    byte[] buffer = new byte[1024];
    int len;
    while((len = is.read(buffer)) != -1){
        fos.write(buffer,0,len);
    }

    System.out.println("图片传输完成");
    
    //6.服务器端给予客户端反馈
    OutputStream os = socket.getOutputStream();
    os.write("你好，美女，照片我已收到，非常漂亮！".getBytes());
    
    //7.
    fos.close();
    is.close();
    socket.close();
    ss.close();
    os.close();
}
```



### 14.3 UDP 网络编程

代码示例

```
//发送端
@Test
public void sender() throws IOException {

    DatagramSocket socket = new DatagramSocket();

    String str = "我是UDP方式发送的导弹";
    byte[] data = str.getBytes();
    InetAddress inet = InetAddress.getLocalHost();
    DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);
    
    socket.send(packet);
    
    socket.close();
}


//接收端
@Test
public void receiver() throws IOException {

    DatagramSocket socket = new DatagramSocket(9090);
    
    byte[] buffer = new byte[100];
    DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
    
    socket.receive(packet);
    
    System.out.println(new String(packet.getData(),0,packet.getLength()));
    
    socket.close();
}
```









### 14.4 URL 编程

#### 1.URL(Uniform Resource Locator)的理解

统一资源定位符，对应着互联网的某一资源地址

#### 2.URL的5个基本结构

​    http://localhost:8080/examples/beauty.jpg?username=Tom

​    协议   主机名    端口号  资源地址           参数列表

#### 3.如何实例化

URL url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");

#### 4.常用方法

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210310152006595.png" alt="image-20210310152006595" style="zoom: 80%;" />



#### 5.可以读取、下载对应的url资源

```
public static void main(String[] args) {

    HttpURLConnection urlConnection = null;
    InputStream is = null;
    FileOutputStream fos = null;
    try {
        URL url = new URL("http://localhost:8080/examples/beauty.jpg");
    
        urlConnection = (HttpURLConnection) url.openConnection();
    
        urlConnection.connect();
    
        is = urlConnection.getInputStream();
        fos = new FileOutputStream("day10\\beauty3.jpg");
    
        byte[] buffer = new byte[1024];
        int len;
        while((len = is.read(buffer)) != -1){
            fos.write(buffer,0,len);
        }
    
        System.out.println("下载完成");
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        //关闭资源
        if(is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(fos != null){
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(urlConnection != null){
            urlConnection.disconnect();
        }
    }
}
```

















## 15. 反射机制

### 15.1 反射概述

#### 1.本章的主要内容

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311160246783.png" alt="image-20210311160246783" style="zoom:67%;" />



#### 2.关于反射的理解

Reflection（反射)是被视为**动态语言**的关键，反射机制允许程序在执行期借助于Reflection API取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。

框架 = 反射 + 注解 + 设计模式。



#### 3.体会反射机制的“动态性”

```
//体会反射的动态性
@Test
public void test2(){

    for(int i = 0;i < 100;i++){
        int num = new Random().nextInt(3);//0,1,2
        String classPath = "";
        switch(num){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.Object";
                break;
            case 2:
                classPath = "com.atguigu.java.Person";
                break;
        }
        try {
            Object obj = getInstance(classPath);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
创建一个指定类的对象。
classPath:指定类的全类名
 */
public Object getInstance(String classPath) throws Exception {
   Class clazz =  Class.forName(classPath);
   return clazz.newInstance();
}
```





#### 4. 反射机制能提供的功能

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311160511847.png" alt="image-20210311160511847" style="zoom:67%;" />



#### 5. 相关API

java.lang.Class:反射的源头
java.lang.reflect.Method
java.lang.reflect.Field
java.lang.reflect.Constructor
....











### 15.2 Class类的理解与获取Class的实例

#### 1.Class类的理解

![image-20210311160657992](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311160657992.png)



#### 2.获取Class实例的几种方式：（前三种方式需要掌握）

```
        //方式一：调用运行时类的属性：.class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二：通过运行时类的对象,调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("com.atguigu.java.Person");

//        clazz3 = Class.forName("java.lang.String");
        System.out.println(clazz3);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
    
        //方式四：使用类的加载器：ClassLoader  (了解)
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("com.atguigu.java.Person");
        System.out.println(clazz4);
    
        System.out.println(clazz1 == clazz4);

```



#### 3. 总结：创建类的对象的方式?

方式一：new + 构造器
方式二：要创建Xxx类的对象，可以考虑：Xxx、Xxxs、XxxFactory、XxxBuilder类中查看是否有
静态方法的存在。可以调用其静态方法，创建Xxx对象。
方式三：通过反射



#### 4. Class实例可以是哪些结构的说明

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311160828143.png" alt="image-20210311160828143" style="zoom:67%;" />













### 15.3 了解 ClassLoader

#### 1. 类的加载过程----了解

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311161022946.png" alt="image-20210311161022946" style="zoom:67%;" />



#### 2. 类的加载器的作用

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311161105129.png" alt="image-20210311161105129" style="zoom: 80%;" />



#### 3. 类的加载器的分类

![image-20210311161155682](C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311161155682.png)





#### 4. Java类编译、运行的执行的流程

<img src="C:\Users\10137\AppData\Roaming\Typora\typora-user-images\image-20210311161215158.png" alt="image-20210311161215158" style="zoom:67%;" />



#### 5. 使用Classloader加载src目录下的配置文件

```
    @Test
    public void test2() throws Exception {

        Properties pros =  new Properties();
        //此时的文件默认在当前的module下。
        //读取配置文件的方式一：

//        FileInputStream fis = new FileInputStream("jdbc.properties");
//        FileInputStream fis = new FileInputStream("src\\jdbc1.properties");
//        pros.load(fis);

        //读取配置文件的方式二：使用ClassLoader
        //配置文件默认识别为：当前module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc1.properties");
        pros.load(is);
    
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = " + user + ",password = " + password);
    }
```









### 15.4 反射应用一：创建运行时类的对象

#### 1.代码举例

```
Class<Person> clazz = Person.class;

Person obj = clazz.newInstance();
System.out.println(obj);
```





#### 2.说明

newInstance():调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参的构造器。

要想此方法正常的创建运行时类的对象，要求：

1. 运行时类必须提供空参的构造器

2. 空参的构造器的访问权限得够。通常，设置为public。

   

在javabean中要求提供一个public的空参构造器。原因：

1. 便于通过反射，创建运行时类的对象

2. 便于子类继承此运行时类时，默认调用super()时，保证父类此构造器







### 15.5 反射应用二：获取运行时类的完整结构

我们可以通过反射，获取对应的运行时类中所有的属性、方法、构造器、父类、接口、父类的泛型、包、注解、异常等。。。。

```
@Test
public void test1(){

    Class clazz = Person.class;
    
    //获取属性结构
    //getFields():获取当前运行时类及其父类中声明为public访问权限的属性
    Field[] fields = clazz.getFields();
    for(Field f : fields){
        System.out.println(f);
    }
    System.out.println();
    
    //getDeclaredFields():获取当前运行时类中声明的所属性。（不包含父类中声明的属性
    Field[] declaredFields = clazz.getDeclaredFields();
    for(Field f : declaredFields){
        System.out.println(f);
    }

}

@Test
public void test1(){

    Class clazz = Person.class;
    
    //getMethods():获取当前运行时类及其所父类中声明为public权限的方法
    Method[] methods = clazz.getMethods();
    for(Method m : methods){
        System.out.println(m);
    }
    System.out.println();
    //getDeclaredMethods():获取当前运行时类中声明的所方法。（不包含父类中声明的方法
    Method[] declaredMethods = clazz.getDeclaredMethods();
    for(Method m : declaredMethods){
        System.out.println(m);
    }

}

/*
    获取构造器结构

     */
    @Test
    public void test1(){
    
        Class clazz = Person.class;
        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }
    
        System.out.println();
        //getDeclaredConstructors():获取当前运行时类中声明的所的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    
    }
    
    /*
    获取运行时类的父类
    
     */
    @Test
    public void test2(){
        Class clazz = Person.class;
    
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }
    
    /*
    获取运行时类的带泛型的父类
    
     */
    @Test
    public void test3(){
        Class clazz = Person.class;
    
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    
    /*
    获取运行时类的带泛型的父类的泛型
    
    代码：逻辑性代码  vs 功能性代码
     */
    @Test
    public void test4(){
        Class clazz = Person.class;
    
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();

//        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    /*
    获取运行时类实现的接口
     */
    @Test
    public void test5(){
        Class clazz = Person.class;
    
        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }
    
        System.out.println();
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }
    
    }
    /*
        获取运行时类所在的包
    
     */
    @Test
    public void test6(){
        Class clazz = Person.class;
    
        Package pack = clazz.getPackage();
        System.out.println(pack);
    }
    
    /*
        获取运行时类声明的注解
    
     */
    @Test
    public void test7(){
        Class clazz = Person.class;
    
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }
```









### 15.6 反射应用三：调用运行时类的指定结构

调用指定的属性：

```
@Test
public void testField1() throws Exception {
    Class clazz = Person.class;

    //创建运行时类的对象
    Person p = (Person) clazz.newInstance();
    
    //1. getDeclaredField(String fieldName):获取运行时类中指定变量名的属性
    Field name = clazz.getDeclaredField("name");
    
    //2.保证当前属性是可访问的
    name.setAccessible(true);
    //3.获取、设置指定对象的此属性值
    name.set(p,"Tom");
    
    System.out.println(name.get(p));
}
```



调用指定的方法：

```
 @Test
    public void testMethod() throws Exception {

        Class clazz = Person.class;
    
        //创建运行时类的对象
        Person p = (Person) clazz.newInstance();
    
        /*
        1.获取指定的某个方法
        getDeclaredMethod():参数1 ：指明获取的方法的名称  参数2：指明获取的方法的形参列表
         */
        Method show = clazz.getDeclaredMethod("show", String.class);
        //2.保证当前方法是可访问的
        show.setAccessible(true);
    
        /*
        3. 调用方法的invoke():参数1：方法的调用者  参数2：给方法形参赋值的实参
        invoke()的返回值即为对应类中调用的方法的返回值。
         */
        Object returnValue = show.invoke(p,"CHN"); //String nation = p.show("CHN");
        System.out.println(returnValue);
    
        System.out.println("*************如何调用静态方法*****************");
    
        // private static void showDesc()
    
        Method showDesc = clazz.getDeclaredMethod("showDesc");
        showDesc.setAccessible(true);
        //如果调用的运行时类中的方法没返回值，则此invoke()返回null

//        Object returnVal = showDesc.invoke(null);
        Object returnVal = showDesc.invoke(Person.class);
        System.out.println(returnVal);//null
    }
```



调用指定的构造器：

```
@Test
public void testConstructor() throws Exception {
    Class clazz = Person.class;

    //private Person(String name)
    /*
    1.获取指定的构造器
    getDeclaredConstructor():参数：指明构造器的参数列表
     */
    
    Constructor constructor = clazz.getDeclaredConstructor(String.class);
    
    //2.保证此构造器是可访问的
    constructor.setAccessible(true);
    
    //3.调用此构造器创建运行时类的对象
    Person per = (Person) constructor.newInstance("Tom");
    System.out.println(per);
}
```











### 15.7 反射应用四：调用运行时类的指定结构

#### 1.代理模式的原理：

使用一个代理将对象包装起来, 然后用该代理对象取代原始对象。任何对原始对象的调用都要通过代理。代理对象决定是否以及何时将方法调用转到原始对象上。 



#### 2.静态代理

##### 2.1 举例：

实现Runnable接口的方法创建多线程

```
Class MyThread implements Runnable{} //相当于被代理类
Class Thread implements Runnable{} //相当于代理类
main(){
	MyThread t = new MyThread();
	Thread thread = new Thread(t);
	thread.start();//启动线程；调用线程的run()
}
```



##### 2.2 静态代理的缺点

① 代理类和目标对象的类都是在编译期间确定下来，不利于程序的扩展。
② 每一个代理类只能为一个接口服务，这样一来程序开发中必然产生过多的代理。



#### 3. 动态代理的特点

动态代理是指客户通过代理类来调用其它对象的方法，并且是在程序运行时根据需要动态创建目标类的代理对象



#### 4. 动态代理的实现

##### 4.1 需要解决的两个主要问题：

问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。 
（通过Proxy.newProxyInstance()实现）
问题二：当通过代理类的对象调用方法a时，如何动态的去调用被代理类中的同名方法a。
(通过InvocationHandler接口的实现类及其方法invoke())



##### 4.2 代码实现：

```
interface Human{

    String getBelief();
    
    void eat(String food);

}
//被代理类
class SuperMan implements Human{


    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }
    
    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

class HumanUtil{

    public void method1(){
        System.out.println("====================通用方法一====================");
    
    }
    
    public void method2(){
        System.out.println("====================通用方法二====================");
    }
}


class ProxyFactory{
    //调用此方法，返回一个代理类的对象。解决问题一
    public static Object getProxyInstance(Object obj){//obj:被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);
    
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;//需要使用被代理类的对象进行赋值
    
    public void bind(Object obj){
        this.obj = obj;
    }
    
    //当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能就声明在invoke()中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    
        HumanUtil util = new HumanUtil();
        util.method1();
    
        //method:即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法
        //obj:被代理类的对象
        Object returnValue = method.invoke(obj,args);
    
        util.method2();
    
        //上述方法的返回值就作为当前类中的invoke()的返回值。
        return returnValue;
    
    }
}

public class ProxyTest {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance:代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        //当通过代理类对象调用方法时，会自动的调用被代理类中同名的方法
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("四川麻辣烫");
    
        System.out.println("*****************************");
    
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
    
        ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
    
        proxyClothFactory.produceCloth();
    
    }
}
```




体会：反射的动态性。





