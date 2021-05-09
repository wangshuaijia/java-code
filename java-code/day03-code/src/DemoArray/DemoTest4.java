package DemoArray;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中
要求使用自定义的方法来实现
 */
public class DemoTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2;
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            list1.add(r.nextInt(100));// 0-99
        }
        list2 = selectArray(list1);
        System.out.println(list2);
    }

    public static ArrayList<Integer> selectArray(ArrayList<Integer> list){
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                l.add(list.get(i));
            }
        }
        return l;
    }
}
