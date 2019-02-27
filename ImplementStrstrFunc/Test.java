package ImplementStrstrFunc;

public class Test {
	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		
		IS solution = new IS();
		System.out.println("Given input : ");
		System.out.println("haystack = \"" + haystack + "\" , needle = \"" + needle + "\"");
		System.out.println("Output : " + solution.strStr(haystack, needle));
	
	}
}
