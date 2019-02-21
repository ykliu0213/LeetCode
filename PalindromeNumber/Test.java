package PalindromeNumber;

public class Test {
	public static void main(String[] args) {
		int input = 121;
		// also can try these following inputs : 
		// -121 , 10
		
		PdNumber solution = new PdNumber();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement with brute-force : " + solution.isPalindrome(input));
	}
}
