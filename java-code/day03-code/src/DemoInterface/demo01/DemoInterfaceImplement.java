package DemoInterface.demo01;

import com.sun.xml.internal.ws.message.source.PayloadSourceMessage;

/*
1、接口的实现类格式：
public class 实现类名 implements 接口名{
    // ...
}
2、接口的实现类必须覆盖重写接口中的所有抽象方法
实现：去掉abstract关键字，加上方法体发括号

注意事项：如果实现类并没有覆盖重写接口中所有的抽象方法，那么这个实现类本身也必须是抽象类
 */
public class DemoInterfaceImplement implements BasicInterface {


    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }

    @Override
    public void method3() {
        System.out.println("method3");
    }

    @Override
    public void method4() {
        System.out.println("method4");
    }

    public static void main(String[] args) {
//        BasicInterface bas = new BasicInterface(); //错误，不能直接new接口
        DemoInterfaceImplement impl = new DemoInterfaceImplement();
        impl.method1();
    }
}
