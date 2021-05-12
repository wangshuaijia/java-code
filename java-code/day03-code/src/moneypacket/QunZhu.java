package moneypacket;

import DemoExtends.Teacher;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class QunZhu extends Person{


    public QunZhu() {
        this.setMoney(500);
    }

    public QunZhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> avgSend(int totalMoney, int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arrayList.add(totalMoney/num);
        }
        this.setMoney(this.getMoney()-totalMoney);
        return arrayList;
    }

    public ArrayList<Integer> ranSend(int totalMoney, int num){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            if (totalMoney > this.getMoney()){
                System.out.println("您的余额不足，请重新输入：");
                totalMoney = new Scanner(System.in).nextInt();
            }
            else{
                Random r = new Random();
                int leftMoney = totalMoney;
                for (int i = 0; i < num-1; i++) {
                    int randomNum = r.nextInt(leftMoney-2)+1;
                    arrayList.add(randomNum);
                    leftMoney -= randomNum;
                }
                arrayList.add(leftMoney);
                return arrayList;
            }
        }


    }
}
