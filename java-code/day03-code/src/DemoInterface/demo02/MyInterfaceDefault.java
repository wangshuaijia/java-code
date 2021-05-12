package DemoInterface.demo02;
/*
从java8开始，接口里允许定义默认方法
格式：
Public default 返回值类型 方法名称(参数){
    // ...
}
备注：接口中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {

    public abstract void method1();

    //已经有实现类A，B，如果想再添加新接口，则使用default默认方法，A和B实现类会自动继承该默认方法
    public default void defaultMethod() {
        System.out.println("这是新添加的默认方法");
    }

}
