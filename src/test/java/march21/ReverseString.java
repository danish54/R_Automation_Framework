package march21;

public class ReverseString {

	public static void main(String[] args) {
	
		System.out.println(reverseWords("Danish Ali"));
		
	}
	

	    public static String reverseWords(String str) {
	        String[] words = str.split(" ");
	        StringBuilder reversed = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]).append(" ");
	        }
	        return reversed.toString().trim();
	    }
	}


