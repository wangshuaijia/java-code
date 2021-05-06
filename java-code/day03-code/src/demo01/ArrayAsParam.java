package demo01;

public class ArrayAsParam {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        printArray(array);// 此处传递的参数为array的地址值
        System.out.println("================AAA");
        printArray(array);
        System.out.println("================BBB");
        printArray(array);

    }

    /*方法三要素:
    * 返回值类型:void
    * 参数列表:int[] array
    * 方法名称:printArray
    * 数组也可以作为方法参数*/

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}
