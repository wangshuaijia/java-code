package demo01;
// 所有的引用类型变量, 都可以赋值为null, 代表什么都没有

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int [] ArrayA = new int[] {1,2,3};
        System.out.println(ArrayA[0]);
        System.out.println(ArrayA[1]);
        System.out.println(ArrayA[2]);
//        此处发生数组索引越界异常 ArrayIndexOutOfBoundsException
//        System.out.println(ArrayA[3]);

    }
}
