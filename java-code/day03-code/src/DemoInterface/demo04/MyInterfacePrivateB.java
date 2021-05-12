package DemoInterface.demo04;

public interface MyInterfacePrivateB {

    public static void method1(){
        System.out.println("这是静态方法1");
        method();
    }

    public static void method2(){
        System.out.println("这是静态方法2");
        method();
    }

    private static void method(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
