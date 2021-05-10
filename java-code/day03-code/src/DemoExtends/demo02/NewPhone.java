package DemoExtends.demo01;

public class NewPhone extends Phone{
    @Override
    public void show() {
        super.show();// 继承父类的方法
        System.out.println("new1"); // 覆盖父类的方法
        System.out.println("new2");
    }

    public static void main(String[] args) {
        NewPhone p1 = new NewPhone();
        p1.show();
    }
}
