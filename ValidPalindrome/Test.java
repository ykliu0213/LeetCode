package ValidPalindrome;

public class Test {
	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";
		
		VP solution = new VP();
		System.out.println("Given input : " + input);
		System.out.println("Output : " + solution.isPalindrome(input));
	}
}
