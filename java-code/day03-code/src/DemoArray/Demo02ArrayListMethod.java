package DemoArray;

import java.util.ArrayList;


/*
public boolean add(E e) 向集合中添加元素，返回值代表是否添加成功

public E get(int index) 从集合获取元素， 参数是索引编号， 返回值是对应位置的元素

public E remove(int index) 从集合移除元素， 返回值是被删除的元素
public int size() 返回集合的大小
 */
public class Demo02ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(2));
        System.out.println(list.size());
        System.out.println(list);
    }

}
