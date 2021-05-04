package demo02;
//判断四种类型是否相等
public class OverLoadJustSame {
    public static void main(String[] args) {
        System.out.println(judge(1,2));
    }

    public static boolean judge(byte a, byte b){
        return a == b;
    }

    public static boolean judge(short a, short b){
        return a == b;
    }

    public static boolean judge(int a, int b){
        return a == b;
    }

    public static boolean judge(long a, long b) {
        return a == b;
    }
}
