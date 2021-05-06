package demo02;

/*
数组  是引用数据类型
两种常见的初始化方式
1、动态初始化（指定长度）
2、静态初始化（指定内容）

动态初始化数组格式
int[] a = new int[5];
分解：
int [] a;
a = new int[4];
静态初始化数组格式
1、int [] b = new int[] {1,2,3,4};
2、int [] b = {1,2,3,4};
 */

public class DemoArray {
    public static void main(String[] args) {
        int[] arrayA = new int[] {1,2,3,4,5};
        System.out.println(arrayA);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println(arrayA[3]);
        System.out.println(arrayA[4]);
//        double[] arrayB = new double[10];
//
//        String[] arrayC = new String[5];
//
//        int [] b =  {1,2,3,4};
//        int [] c =  {1,2,3,4};
    }
}
