package JavaTop1;


public class ReverserEachLetter {

    public static void main(String[] args) {
        reverse();
    }
    static void reverse(){

        String name = "Danish Ali";
        String Reverser = "";

        String[] sname= name.split(" ");
        for(String word: sname){
            for(int i =word.length()-1; i>=0; i--){
                Reverser = new StringBuilder().append(Reverser).append(word.charAt(i)).toString();
            }
            Reverser = Reverser + " ";
        }

        System.out.println(Reverser);
    }
}
