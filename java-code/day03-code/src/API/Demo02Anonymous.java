package API;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //若对象只使用一次，可以用匿名对象
//        Scanner sc = new Scanner(System.in);
        int num = new Scanner(System.in).nextInt();
        System.out.println("1、输入的数字是: "+num);

        //使用匿名对象作为参数传入
        print(new Scanner(System.in));

        //对象作为返回值
        Scanner sc = methodReturn();
        System.out.println("3、输入的数字是: "+sc.nextInt());
    }

    // 对象作为参数
    public static void print(Scanner sc){
        System.out.println("2、输入的数字是: "+sc.nextInt());
    }

    //对象作为返回值类型
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
