package API;

import java.util.Random;

/*random类
nextInt() 是包含正负的所有数字范围-21亿----+21亿
nextInt(n) 是从[0,n)之间的随机数
 */

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数是：" + num);

        Random r2 = new Random();
        int num2 = r2.nextInt(2);//此处n为2， 则只会随机出0，1
        System.out.println("随机数是：" + num2);

    }
}
