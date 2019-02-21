package LongestPalindromicSubstring;

public class Test {
	public static void main(String[] args) {
		String input = "cbbd";
		// also can try these following input :
		// "" , "a" , "babad"
		
		LPS solution = new LPS();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement with brute-force : " + solution.longestPalindrome(input));
	}
}
