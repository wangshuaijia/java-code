package DemoInterface.demo06;

/*
1、接口是没有静态代码块或者构造方法的
2、一个类的直接父类是唯一的，但是可以同时实现多个接口
3、如果实现类实现的接口中，存在重复的抽象方法，那么只需要覆盖重写一次就可
4、如果实现类实现的接口中存在重复的默认方法，那么是实现类必须对接口进行覆盖重写
5、一个类如果直接父类的方法和接口当中的默认方法存在冲突的方法，则优先用父类的方法
格式：public class MyInterfaceImpl extends 父类 implements MyInterfaceA, MyInterfaceB{


 */
public interface MyInterfaceA {

    public abstract void method1();

    public abstract void publicMethod();
}
