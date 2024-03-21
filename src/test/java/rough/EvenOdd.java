package rough;

public class EvenOdd {

    public static void main(String[] args) {
        OddName(50);
    }

    public static void evennum(int a){
        for(int i=0; i<=a; i++){
            if (i%2==0){
                System.out.println("Even Number =>" +i);
            }
            else {
                System.out.println("Odd Number =>"+i);
            }
        }
    }

    public static void OddName(int n){
        int j=0;
        for (int i = 0; i <=n ; i++) {

            if(i%2 !=0){
                j++;
            }

        }
        System.out.println("Odd Number Count => "+j);

    }

}
