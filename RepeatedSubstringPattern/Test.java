package RepeatedSubstringPattern;

public class Test {
	public static void main(String[] args) {
		String input = "abab";
		// also can try these following input :
		// "aba" , "abcabcabcabc"
		
		RSP solution = new RSP();
		RSP_StringFunc sol = new RSP_StringFunc();
		System.out.println("Given input : " + input);
		System.out.println("Implement with brute-force : " + solution.repeatedSubstringPattern(input));
		System.out.println("Implement with contains() : " + sol.repeatedSubstringPattern(input));
	}
}
