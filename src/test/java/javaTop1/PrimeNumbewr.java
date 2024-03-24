package javaTop1;

import org.testng.annotations.Test;

public class PrimeNumbewr {
    public static void main(String[] args) {
        boolean b = primetest();
        System.out.println(b);
    }

    public static boolean primetest() {
        int a =7;
        if (a==2){
            return true;
        }
         if(a==1){
            return false;
        }
        for (int i = 2; i <=a/2 ; i++) {
            if (a%i==0){
                return false;
            }

        }
        return true ;
    }
}
