package demo01;

// 数组的遍历
//数组长度  array.length

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        // for循环遍历, 5.fori快捷提示
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============================");
        // 使用数组长度遍历  数组名.fori
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
