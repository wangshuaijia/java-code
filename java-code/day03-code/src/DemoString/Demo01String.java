package DemoString;

/*
创建字符串的3+1种方法：
public String
public String(char[] array)
public String(byte[] array)
直接创建
String str = "hello world"
 */
public class Demo01String {
    public static void main(String[] args) {
        char[] array1 = {'1','2','3'};
        String str1 = new String(array1);
        System.out.println("char[]方法创建的字符串为："+str1);

        byte[] array2 = {100, 101,102};
        String str2 = new String(array2);
        System.out.println("Byte方法创建的字符串为："+str2);

    }
}
