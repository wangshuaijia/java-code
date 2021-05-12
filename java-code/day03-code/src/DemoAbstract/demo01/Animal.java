package DemoAbstract.demo01;
/*
抽象方法： 加上abstract修饰，去掉大括号
抽象类， 抽象方法所在的类必须是抽象类， class前用abstract修饰
抽象类中不一定有抽象方法

使用方法：
1、 不能直接创建new抽象类对象
2、 必须用一个子类继承抽象类
3、 子类必须覆盖重写抽象父类当中的所有抽象方法
 */
public abstract class Animal {
    public abstract void eat();

    public void normalMethod(){
        System.out.println("抽象类中可用普通成员方法");
    }
}
