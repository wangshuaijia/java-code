package moneypacket;

import java.util.ArrayList;
import java.util.Random;

public class QunYuan extends Person{

    public void recMoney(ArrayList<Integer> arrayList){
        int num = new Random().nextInt(arrayList.size());
        this.setMoney(this.getMoney()+arrayList.get(num));
    }
}
