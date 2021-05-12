package DemoInterface.demo02;

// 本类中只实现了接口中的method1方法
// 但是继承了新添加的default方法,同时可以对其进行覆盖重写
public class MyInterfaceA implements MyInterfaceDefault {

    @Override
    public void method1() {
        System.out.println("我实现了接口中的method1方法，AAA");
    }

    @Override
    public void defaultMethod() {
        System.out.println("AAA，重写了接口中的默认方法");
    }
}
