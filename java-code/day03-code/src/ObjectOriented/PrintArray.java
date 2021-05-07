package ObjectOriented;
/*
* 面向过程: 当需要实现一个功能时, 每一个具体的步骤都要亲历亲为, 详细处理每个细节.
* 面向对象: 当需要实现一个功能时, 不关心具体的步骤, 而是找一个已经具有该功能的人, 来帮我做事.
* */

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //要求打印格式为[1,2,3,,4,5],使用面向过程
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + "]");
        System.out.println("===================================");
        //使用面向对象
        //找一个JDK提供好的Arrays类
        //其中有一个toString方法, 直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
