package LengthOfLastWord;

public class Test {
	public static void main(String[] args) {
		String input = "Hello World";
		// also can try these following input : 
		// "HelloWorld" , " " , "      " , " hello world "
		
		LLW_split solution = new LLW_split();
		LLW_count sol = new LLW_count();
		System.out.println("Given input : " + input);
		System.out.println("Implement with split : " + solution.lengthOfLastWord(input));
		System.out.println("Implement with count : " + sol.lengthOfLastWord(input));
	}
}
