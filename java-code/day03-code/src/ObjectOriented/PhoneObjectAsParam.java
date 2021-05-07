package ObjectOriented;

// 类对象对为方法参数传入

/*
局部变量: 位于栈内存, 调用方法时才使用,调用方法,方法必须进栈
成员变量: 位于堆内存, new的时候才有,凡是new出来的都在堆中
 */

public class PhoneObjectAsParam {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.color = "red";
        phone1.price = 10000;
        phone1.type = "三星";
        method(phone1);
        System.out.println("--------------------------");
        // 类对象作为方法的返回值
        Phone phone2 = getphone();
        method(phone2);
    }

    public static void method(Phone phone){
        System.out.println(phone.type);
        System.out.println(phone.price);
        System.out.println(phone.color);
    }

    public static Phone getphone(){
        Phone phone = new Phone();
        phone.color = "black";
        phone.price = 4000;
        phone.type = "苹果";
        return phone;
    }
}
