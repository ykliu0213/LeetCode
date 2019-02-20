package LongestSubstringWithoutRepeatingCharacters;

public class Test {
	public static void main(String[] args) {
		String input = "abcabcbb";
		
		LSWRC solution = new LSWRC();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Output : " + solution.lengthOfLongestSubstring(input));
	}
}
