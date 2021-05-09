package DemoArray;

import java.util.ArrayList;

// 定义以指定格式打印集合的方法(ArrayList类型作为参数)， 使用{}扩起集合， 使用@分隔每个元素，如{元素@元素@元素}
public class DemoTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        print(list);
    }

    public static void print(ArrayList<Integer> list){
//        System.out.println(list.toString());// [1,2,3,4]
        System.out.print("{");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i));
            System.out.print("@");
        }
        System.out.print(list.get(list.size()-1) + "}");
    }
}
