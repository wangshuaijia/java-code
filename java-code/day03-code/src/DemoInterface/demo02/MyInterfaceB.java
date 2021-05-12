package DemoInterface.demo02;

public class MyInterfaceB implements MyInterfaceDefault {

    @Override
    public void method1() {
        System.out.println("我实现了接口中的method1方法，BBB");
    }

    @Override
    public void defaultMethod() {
        System.out.println("BBB，重写了接口中的默认方法");
    }

}
