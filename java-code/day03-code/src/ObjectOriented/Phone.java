package ObjectOriented;

public class Phone {

    String type; // 手机品牌
    int price; // 手机价格
    String color; // 手机颜色

    public void call(String phone){
        System.out.println("call " + phone);
    }

    public void sendMessage(){
        System.out.println("sendMessage");
    }
}
