package javaTop1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListCode1 {

    @Test
    void test(){
        List<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        System.out.println(n.size());
    }

    @Test
    public void voovel(){
        String s = "My name is danish";
        boolean  b= s.toLowerCase().matches(".*[aeiou].*");
        System.out.println(b);
    }


}
