package DemoArray;

import java.util.ArrayList;

// 自定义四个人对象， 添加到集合， 并遍历
public class DemoTest2 {
    public static void main(String[] args) {
        ArrayList<Person> list1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
//            Person p = new Person("古力娜扎"+i);
//            list1.add(p);
            list1.add(new Person("古丽娜扎" + i));
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("第" + i + "个人的名字为：" + list1.get(i).getName());
        }
    }
}
