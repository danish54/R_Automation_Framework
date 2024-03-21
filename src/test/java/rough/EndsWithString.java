package rough;

import org.testng.annotations.Test;

public class EndsWithString {

    public static void main(String[] args) {
        lastname();

    }
            public static void lastname(){
        String name = "My name is Danish";
        String[] s= name.split(" ");
        for (String word : s){
                if(word.charAt(0)=='D'){
                    System.out.println(word);
                }
        }
    }
}
