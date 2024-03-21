package customExcpetion;


	public class Test{
		
		static void validateAge(int a) throws InvalidAgeException  {
			
			if(a<18) {
				throw new InvalidAgeException("Invalidate Age");
			}
			else {
				System.out.println("Welcome");
			}
			
		}
		
		public static void main(String[] args) throws InvalidAgeException {
			validateAge(13);
		}
	}
