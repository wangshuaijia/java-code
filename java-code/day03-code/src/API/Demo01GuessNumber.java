package API;

import com.sun.deploy.security.BrowserKeystore;

import java.util.Random;
import java.util.Scanner;

public class Demo01GuessNumber {
    public static void main(String[] args) {
        int result = new Random().nextInt(100);
        System.out.println("数字是: "+ result);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入一个数字：");
            int num = new Scanner(System.in).nextInt();
            if (num == result){
                System.out.println("恭喜你， 猜对了");
                break;
            }
            else {
                System.out.println("猜错了！");
            }
        }
    }
}
