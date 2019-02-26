package ValidPalindromeII;

public class Test {
	public static void main(String[] args) {
		String input = "aba";
		// also can try these following input :
		// "abca" , "abc"
		
		VPII solution = new VPII();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Output : " + solution.validPalindrome(input));
	}
}
