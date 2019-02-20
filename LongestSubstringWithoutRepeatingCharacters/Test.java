package LongestSubstringWithoutRepeatingCharacters;

public class Test {
	public static void main(String[] args) {
		String input = "abcabcbb";
		int expect = 3;
		
		LSWRC solution = new LSWRC();
		LSWRCHashSet hashSolution = new LSWRCHashSet();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Expect : " + expect);
		System.out.println("implement with brute-force : " + solution.lengthOfLongestSubstring(input));
		System.out.println("implement with hashset : " + hashSolution.lengthOfLongestSubstring(input));
	}
}
