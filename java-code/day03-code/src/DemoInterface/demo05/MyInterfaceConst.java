package DemoInterface.demo05;

/*
接口中也可以定义成员变量，但是必须使用 public static final关键字，final表示不可变。
如：     public static final int num = 10;
1、关键字都可以省略
2、接口当中的常量，必须进行赋值，不能不赋值
3、接口中常量的名称，使用完全大写，并用下划线分割
 */
public interface MyInterfaceConst {
    public static final int NUM_OF_PEOPLE = 10;
}
