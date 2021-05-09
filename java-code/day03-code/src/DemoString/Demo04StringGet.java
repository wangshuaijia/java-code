package DemoString;

/*
public int length() 获取字符串当中含有的字符个数， 拿到字符串长度
public String concat(String str) 将当前字符串与参数字符串拼接返回新的字符串
public char charAt(int index) 获取指定索引位置的单个字符
public int indexOf(String str) 查找参数字符串再本字符串中首次出现的索引位置， 如果没有返回-1；
public String subString(int index) 截取从参数位置一直到字符串结尾，返回新字符串
public String subString(int begin, int end) 截取从begin开始，到end结尾的中间的字符串[)左闭右开
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        String str1 = "abcbcdefghijkabc";
        String str2 = "abc";
        System.out.println("str1的长度为：" + str1.length());
        String str3 = str2.concat(str1);
        System.out.println("str1与str2拼接后："+str3);
        System.out.println("str1的第三号字符为："+str1.charAt(3));
        System.out.println("str2在str1中的位置是："+str1.indexOf(str2,8));
        String str4 = str1.substring(3);
        System.out.println(str4);
        String str5 = str1.substring(3,5);
        System.out.println(str5);
    }
}
