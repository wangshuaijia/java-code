package DemoArray;

import java.util.ArrayList;

/*
数组的长度不可变，但是ArrayList长度可变
对与ArrayList来说， 有一个尖括号《E》代表泛型。
泛型： 也就是装在集合当中的所有元素， 全都是统一的类型
注意： 泛型只能是引用类型， 不能是基本类型

注意事项：
对于ArrayList来说， 直接打印得到的不是地址值， 如果是空， 则打印[] ， 否则打印一个列表，如[1,2]

 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("玛尔扎哈");
        System.out.println(list);
    }
}
