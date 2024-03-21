package rough;

import org.testng.annotations.Test;

public class StringReversse {
    String name = "Danish Ali";

    @Test
    public void setName(){
        String[] sname = name.split(" ");
        StringBuilder rname = new StringBuilder();
        for(String word : sname){

            for (int i = word.length()-1; i >=0 ; i--) {
                char s = word.charAt(i);
                rname.append(s);
            }
            rname.append(" ");
            //System.out.println(rname);

        }
        System.out.println(rname);
    }

}
