package StandStudent;

/*
 一个标准的Java类有以下四个方面：
1、 所有的成员变量都使用private关键字修饰
2、 为每一个成员变量编写一对Getter/Setter方法
3、 编写一个无参构造方法
4、 编写一个有参构造方法

使用IDEA自带的代码生成,
Code-->generate
如果是构造方法，-->constructor
如果是setter/getter，-->getter and setter
 */

public class StandardStudent {
    private String name;
    private int age;
    private double height;

    public StandardStudent() {
    }

    public StandardStudent(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
