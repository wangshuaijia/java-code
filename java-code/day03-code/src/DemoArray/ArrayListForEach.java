package DemoArray;

import java.util.ArrayList;
// ArrayList集合的遍历
/*
ArrayList的泛型如果不是引用类型，则需要按照以下方式写
基本类型   引用类型(引用类型，包装类都在java.lang包中)
byte    Byte
short   Short
int     Integer     [特殊]
long    Long
float   Float
double  Double
char    Character   [特殊]
boolean Boolean
 */
public class ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list2.get(1));
    }
}
