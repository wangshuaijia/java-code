package DemoExtends;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/*
在继承的关系中， “子类就是一个父类”， 也就是说， 子类可以当作父类看待
例如父类是员工 子类是讲师

父类格式：
public class 父类{
    // ...
}

子类格式：
public class 子类 extends 父类{
    // ...
}

三种变量的重名
    局部变量        直接调用
    成员变量        使用this关键字
    父类成员变量      使用super关键字

方法覆盖重写的注意事项：
1、必须保证父类和子类的方法名相同，参数列表也相同
@override,可以不写
2、子类方法的返回值类型必须小于等于父类方法的返回值类型
java.lang.Object类是所有类的公共最高子类（祖宗类） java.lang.String 就是Object的子类
满足的情况如：父类方法 Object  子类方法 String  反之则不行
3、子类方法的权限修饰符必须大于等于父类方法的权限修饰符 public -> protected -> (default) -> private
default 不是关键字，而是什么都不写， 留空

 */
public class BasicExtends {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.method();
    }
}
