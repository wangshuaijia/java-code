package ArrayTest;


// 数组作为返回值类型
// public static int[]
// 任何数据类型都能作为方法的参数类型或者返回值类型

public class ArrayAsReturn {
    public static void main(String[] args) {
        int[] res = calculate(1,2,3);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }

    public static int[] calculate(int a, int b, int c){
        int sum = a + b + c;
        int avg = sum / 3;
        int[] array = {sum, avg};// 静态初始化
//        int[] array = new int[2];
//        array[0] = sum;
//        array[1] = avg;
        return array;
    }
}
