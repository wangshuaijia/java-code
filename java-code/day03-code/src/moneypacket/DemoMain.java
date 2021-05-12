package moneypacket;

import java.util.ArrayList;
import java.util.Random;

public class DemoMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList;
        QunZhu qz = new QunZhu();
        arrayList = qz.ranSend(600,5);
        QunYuan qy = new QunYuan();
        qy.recMoney(arrayList);
        qy.show();
//        cal();
    }

}
