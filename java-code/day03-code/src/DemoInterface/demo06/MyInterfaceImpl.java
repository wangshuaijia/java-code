package DemoInterface.demo06;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
    @Override
    public void method1() {
        System.out.println("接口A中的方法");
    }

    @Override
    public void method2() {
        System.out.println("接口B中的方法");
    }

    // 实现的两个接口中都有该方法，实现一次即可
    @Override
    public void publicMethod() {
        System.out.println("两个接口中共有的方法，实现一次即可");
    }
}
