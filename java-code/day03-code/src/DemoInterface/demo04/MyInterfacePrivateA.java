package DemoInterface.demo04;

/*
1、普通私有方法， 解决多个默认方法之间重复代码的问题
private 返回值类型 方法名(){
}
2、静态私有方法， 解决多个静态方法之间重复代码的问题
private static 返回值类型 方法名(){
}
 */

public interface MyInterfacePrivateA {

    //如果出现两个默认方法有重复代码的情况，重复代码又不想被实现类访问，则使用private关键字创建私有方法
    public default void method1(){
        privateMethod();
    }

    public default void method2(){
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
