# java4
#计191李军成-2019311291
# 一、实验目的：
1.Java 应用程序有2个类,分别为 Doctor和主类Test，有2个接口，分别为Student，Teacher。

2.掌握Java中抽象类和抽象方法的定义。

3.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法。

4.了解异常的使用方法，并在程序中根据输入情况做异常处理。
# 二、实验要求：
1.接口Student：设置了payFare（），chackFare（）两个方法，缴纳学费、查学费的方法。

2.接口Teacher：设置了getSalary（），chackSalary（）两个方法，发放薪水和查询薪水的方法。

3.Doctor类：声明了name,gender,age,Fare,Salary五个变量，并构造方法进行赋值和输出。

4.主类Test的要求：

1.实例化至少两名博士研究生，统计他们的年收入和学费。

2.算出每名博士研究生的年应纳税金额。

3.对年学费和年收入进行统计，用收入减去学费，求得纳税额。

4.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。

5.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值。
# 三、操作过程：

1.首先构造了2个Teacher,Student接口,构造了Doctor类和主类Test2个类。

2.接口Student中设置了payFare（），chackFare（）两个方法，实现缴纳学费、查学费。接口Teacher：设置了getSalary（）

，chackSalary（）两个方法，实现发放薪水和查询薪水。Doctor类：声明了name,gender,age,Fare,Salary五个变量，并构造

方法进行赋值和输出。

3.在主类Test中实例化两名博士研究生并统计他们的年收入和学费。

5.调用switch（）方法进行查询学费。

# 四、核心代码：

本次实验中的核心代码如下所示，它通过调用实现implements接口，调用switch（）实现查询学费。
```java
 public class Doctor implements Student,Teacher {
 }
```
```java
 witch (i) {
                case 1:
                    System.out.println("缴纳学费为" + i1.payFare(g1));
                    break;
                case 2:
                    System.out.println("查询学费为" + i2.chackFare(g1));
                    break;
                case 3:
                    System.out.println("查询工资为（每月交税前）" + i1.getSalary(g2));
                    System.out.println("查询工资为（每月交税后）" + (i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105));
                    System.out.println("查询工资为（每年交税后）" + ((i1.getSalary(g2) - (i1.getSalary(g2) * 0.1) - 105) * 9 - 2 * g1));
                    break;
                case 0:
                    break s;

            }
```
# 五、实验结果：
![](https://github.com/lijuncheng555/java4/blob/main/d7319016085e26cd8f64a70f2ee05b2.png)
# 六、实验感想：

1.此次实验我会了如何利用implements，switch（）。

2.编程总是遇到诸多问题，在解决问题中找到了学习java的正确方法。

3.在于同学的探讨中，也为学习增添了许多乐趣。
