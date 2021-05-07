package ObjectOriented;

/*
通常情况下，一个类不能直接使用，需要创建一个对象才能使用
1、 导包 也就是指出需要使用的类， 在什么位置
import 包名称.类名称       对于和当前类处于同一个包的情况， 可以省略导包语句不写

2、 创建 格式：
类名称 对象名 = new 类名称();
Student stu = new Student();

3、 使用  分两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名()

注意事项：
如果成员变量没有赋值， 将会有一个默认值， 规则和数组一样
 */
public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.eat();
    }
}
