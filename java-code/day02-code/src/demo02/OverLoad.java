package demo02;


//shift+f6 可以将方法某个变进行统一更改
/*
重载  方法名称一样，参数列表不一样
注意事项：
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同
public static int sum(double a, int b)
public static int sum(int a, double b)

重载与下列因素无关：
1、参数名称无关
2、与方法的返回值类型无关
public static int sum(double a, double b)
public static double sum(double a, double b)
*/

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3, 4));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
