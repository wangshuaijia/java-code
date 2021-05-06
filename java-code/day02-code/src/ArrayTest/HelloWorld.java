package ArrayTest;

public class HelloWorld {
    public static void main(String[] args) {
//        print();
        int sum = sum(4,5);
        System.out.println(sum);
    }

    public static void print() {
        for (int i = 1; i <= 20; i++){
            for (int j = 1; j <= 20; j++){
                if (i == 1 || i == 20 || j == 1 || j == 20)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static int sum(int a,int b){
        return a + b;
    }

}

