package DemoInterface.demo03;

public class Demo01Interface {
    public static void main(String[] args) {
        //要使用接口中的静态方法，直接用接口名称调用
        MyInterfaceStatic.staticMethod();

        //这样的方法是错误的,不能通过实现类调用
        // MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();
        // impl.staticMethod();
    }
}
