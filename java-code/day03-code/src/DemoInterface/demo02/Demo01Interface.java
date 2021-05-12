package DemoInterface.demo02;

public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceB instanceB = new MyInterfaceB();
        instanceB.method1();
        instanceB.defaultMethod();
        MyInterfaceA instanceA = new MyInterfaceA();
        instanceA.method1();
        instanceA.defaultMethod();

    }
}
