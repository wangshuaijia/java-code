package DemoInterface.demo03;

/*
从java8开始，接口中允许使用静态方法
格式：
public static 返回值类型 方法名称（参数列表）{
    方法体
}
提示：就是将default或者abstract换成static
 */
public interface MyInterfaceStatic {

    public static void staticMethod(){
        System.out.println("接口中的静态方法，直接通过接口名称调用，不能通过实现类调用");
    }
}
