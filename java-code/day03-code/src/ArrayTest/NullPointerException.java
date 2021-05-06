package ArrayTest;

// 数组赋值为null, 没有new创建, 访问时将会发生空指针异常, NullPointerException
public class NullPointerException {
    public static void main(String[] args) {
        int[] ArrayA = null;
        System.out.println(ArrayA[0]);
    }
}
