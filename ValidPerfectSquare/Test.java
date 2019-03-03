package ValidPerfectSquare;

public class Test {
	public static void main(String[] args) {
		int input = 16;
		// also can try these following input :
		// 5 , 2147483647

		VPS solution = new VPS();
		System.out.println("Given input : " + input);
		System.out.println("Output : " + solution.isPerfectSquare(input));
	}
}
