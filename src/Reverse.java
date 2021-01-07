
public class Reverse {

	public static void main(String[] args) {
		
		System.out.println(ReverseString());
	
	}
	
	
	public static String ReverseString() {
		
		String Reverse = "Hello People";
		String Reversed = "";
		
		
		
		for (int i = Reverse.length()-1; i >= 0; i--) {
			
			Reversed = Reversed + Reverse.charAt(i);
		}

		return Reversed;
	}

}
