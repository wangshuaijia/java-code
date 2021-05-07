package ObjectOriented;

// private 关键字限制成员变量的访问
// 设置必须用setXxx, 获取必须用getXxx,有一个特例, 当类型时boolean时, 获取值用的时isXxx
// 当方法的局部变量和成员变量重名时, 根据就近原则, 优先使用局部变量.
// 如果需要访问本类当中的成员变量, 需要使用格式
// this.成员变量名, 谁调用的方法, 谁就是this

public class Person {
    String name;
    private int age;
    private boolean male;//是不是男生

    public void printMessage(){
        System.out.println("我叫:"+name+" 年龄: "+age + "是不是老爷们: " + male);
    }

    public void sayHello(String who){
        System.out.println("你好," + who + ",我是 " + this.name);
        System.out.println(this);
    }

    public void setAge(int num) {
        if (num < 100 && num > 0){
            age = num;
        }
        else{
            System.out.println("输入的年龄不合理");
        }
    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

}
