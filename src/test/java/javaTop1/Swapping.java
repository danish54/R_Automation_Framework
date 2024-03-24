package javaTop1;

import org.testng.annotations.Test;

public class Swapping {

    @Test
            public void swapnumber() {


        int a = 5;
        int b = 6;

        b = a+b;
        a = b-a;
        b= b-a;

        System.out.println("A => "+a);
        System.out.println("B => "+b);
    }


}
