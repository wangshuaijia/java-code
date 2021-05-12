package DemoInterface.demo01;

/*
接口就是多个类的公共规范
接口是一个引用数据类型，最重要的内容就是其中的：抽象方法

定义：
Public interface name{
    // 接口内容
}
接口包含的内容：
java 7
1、  常量 2、抽象方法
java 8
3、默认方法 4、静态方法
java 9
5、私有方法
注意事项：
1、接口中的抽象方法，修饰符必须是public abstract
2、方法的三要素可以随意选择，参数，返回值类型，方法名
 */
public interface BasicInterface {
    //以下四种定义都可以定义抽象方法,即public abstract可以省略
    public abstract void method1();
    public void method2();
    abstract void method3();
    void method4();
}
