package demo01;

//获取数组长度: Array.length
//注意:数组一旦创建后, 程序运行期间, 长度不可变

public class ArrayLength {
    public static void main(String[] args) {
        int [] ArrayA = new int[] {1,2,3,4,5,6};
        int len = ArrayA.length;
        System.out.println(len);


        int[] ArrayB = new int[3];
        System.out.println(ArrayB.length);// 3
        ArrayB = new int[5];
        System.out.println(ArrayB.length);// 5
        // 此处长度改变只是变量Array指向了不同的数组, 实际在堆中的数组是new int[3] 和new int[5], 而不是ArrayB
    }
}
