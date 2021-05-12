package DemoExtends;
/*
方法覆盖重写的注意事项：
1、必须保证父类和子类的方法名相同，参数列表也相同
@override,可以不写
2、子类方法的返回值类型必须小于等于父类方法的返回值类型
java.lang.Object类是所有类的公共最高子类（祖宗类） java.lang.String 就是Object的子类
满足的情况如：父类方法 Object  子类方法 String  反之则不行
3、子类方法的权限修饰符必须大于等于父类方法的权限修饰符 public -> protected -> (default) -> private
default 不是关键字，而是什么都不写， 留空
 */
class Zi extends Fu {
    // 该关键字用来确保本方法是重写的方法，如果不是重写的方法， 会报错
    @Override
    public void method() {
        System.out.println("子类的覆盖重写方法");
    }
}
