package moneypacket;

public class Person {

    private String name;
    private int money = 0;

    public Person() {
    }

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void show() {
        System.out.println("余额为:" + this.money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
