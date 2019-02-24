package ValidParentheses;

public class Test {
	public static void main(String[] args) {
		String input = "()[]{}";

		VP solution = new VP();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement with brute-force : " + solution.isValid(input));
	}
}
