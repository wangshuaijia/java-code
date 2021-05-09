package StandStudent;

public class Demo01Student {
    public static void main(String[] args) {
        StandardStudent stu1 = new StandardStudent();
        stu1.setAge(14);
        stu1.setHeight(178);
        stu1.setName("大帅哥");
        System.out.println("姓名: " + stu1.getName() + " 年龄: " + stu1.getAge() + "身高 :" + stu1.getHeight());
        System.out.println("==========================");
        StandardStudent stu2 = new StandardStudent("小美女",18,170);
        System.out.println("姓名: " + stu2.getName() + " 年龄: " + stu2.getAge() + "身高 :" + stu2.getHeight());

    }
}
