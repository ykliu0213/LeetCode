package LongestCommonPrefix;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] input = {"flower","flow","flight"};
		
		LCP solution = new LCP();
		System.out.println("Given input : " + Arrays.toString(input));
		System.out.println("Implement with brute-force : " + solution.longestCommonPrefix(input));
	}
}
