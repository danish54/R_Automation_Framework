package JavaTop1;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Listcode {

    @Test
    void test(){
        List<Integer> n = new ArrayList<>();
        n.add(2);
        n.add(3);
        System.out.println(n.size());
    }
}
