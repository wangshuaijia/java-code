package API;

import java.util.Scanner;
//判断三个数字的最大值
public class Demo01ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);
        System.out.println("max is " + max);
    }

}
