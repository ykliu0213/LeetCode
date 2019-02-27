package ImplementStrstrFunc;

public class Test {
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		
		IS solution = new IS();
		IS_indexOf sol = new IS_indexOf();
		System.out.println("Given input :  [ haystack = \"" + haystack + "\" , needle = \"" + needle + "\" ]");
		System.out.println("Implement with brute-force : " + solution.strStr(haystack, needle));
		System.out.println("Implement with indexOf() : " + sol.strStr(haystack, needle));
	}
}
