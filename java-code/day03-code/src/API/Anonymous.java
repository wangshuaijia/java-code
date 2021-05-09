package API;

//匿名对象
public class Anonymous {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "小帅哥";
        p.showName();

        //匿名对象
        new Person().name = "好";
        new Person().showName();
    }
}
