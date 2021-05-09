package DemoArray;

// 数组长度一旦创建，就不能改变长度
// ArrayList ，长度可以变化
public class ArrayObject {
    public static void main(String[] args) {
        Person[] array = new Person[3];//创建一个可以存放3个person对象的数组
        //数组进行初始化
        array[0] = new Person("古力娜扎");
        array[1] = new Person("迪丽热巴");
        array[2] = new Person("马儿扎哈");
        array[0].setName("古力娜扎");
        array[1].setName("迪丽热巴");
        array[2].setName("马儿扎哈");
        System.out.println(array[0].getName());
        System.out.println(array[1].getName());
        System.out.println(array[2].getName());
    }
}
