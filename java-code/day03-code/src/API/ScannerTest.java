package API;
/*
 Scanner 类的功能： 可以实现键盘输入数据到程序中
 引用类型的一般使用步骤：（只要不是基本数据类型就是引用类型）

 1、 导包
  import 包路径.类名称
  如果需要使用的目标类， 和当前类在同一个包下， 则可以省略导包语句不写。
  特别的，只有java.lang包下的内容不需要导包， 如String.

  2、 创建
  类名称 对象名 = new 类名称();

  3、 使用
  对象名.方法名();

  Scanner
  获取键盘输入的整数  int num = sc.nextInt();
  获取键盘输入的字符串 String str = sc.next();
 */

import java.util.Scanner; //导包


public class ScannerTest {
    public static void main(String[] args) {
        // 2 创建
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的整数是： " + num);
        String str = sc.next();
        System.out.println("输入的字符串是： " + str);
    }
}
