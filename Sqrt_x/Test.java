package Sqrt_x;

public class Test {
	public static void main(String[] args) {
		int input = 4;
		// also can try these following input : 
		// 0 , 2147483647
		
		Sqrt solution = new Sqrt();
		System.out.println("Given input : " + input);
		System.out.println("Output : " + solution.mySqrt(input));
	}
}
