package ObjectOriented;

//手机类的调用, 包括构造方法的使用
/*
构造方法是专门用来创建对象的方法, 当使用new关键字来创建对象时, 就是在调用构造方法。
格式:
public 类名（参数类型 参数）{
    方法体
    }
注意事项：
1、 构造发方法的名称必须和所在的类名称完全一样， 包括大小写
2、 构造方法不要写返回值类型 ， 包括void也不写
3、 构造方法不能return一个具体的返回值
4、 如果没有写任何构造方法， 编译器会默认给一个构造方法，无参数， 方法体也为空
5、 一旦写了至少一个构造方法， 编译器将不再默认提供构造方法, 构造方法可以有多个，使用重载，方法名相同，参数不同
 */
public class Phone {

    String type; // 手机品牌
    int price; // 手机价格
    String color; // 手机颜色

    public Phone(){
        System.out.println("无参构造方法执行了");
    }

    public Phone(String type, int price, String color){
        System.out.println("有参构造方法执行了");
        this.type = type;
        this.price = price;
        this.color = color;
    }

    public void call(String phone) {
        System.out.println("call " + phone);
    }

    public void sendMessage() {
        System.out.println("sendMessage");
    }
}
