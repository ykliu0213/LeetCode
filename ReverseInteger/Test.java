package ReverseInteger;

public class Test {
	public static void main(String[] args) {
		int input = 123;
		// also can try these following input:
		// -123 , 120 , 1534236469
		
		ReverseInt solution = new ReverseInt();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement with brute-force : " + solution.reverse(input));
	}
}
