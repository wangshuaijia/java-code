package ObjectOriented;
/*
定义一个类,模拟"学生"事物, 其中有两个组成部分
属性(是什么): 姓名 年龄
方法(能做什么):吃饭 睡觉 学习

对应到java类中:
成员变量(属性):
string name
int age
成员方法(行为): 成员方法不带static
public void eat(){}
public void sleep(){}
public void study(){}

注意事项:
1、 成员变量时直接定义在类中的， 在方法外面
2、 成员方法不要学static关键字
 */
public class Student {

    String name;// 姓名
    int age;// 年龄

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }

    public void study(){
        System.out.println("study");
    }
}
