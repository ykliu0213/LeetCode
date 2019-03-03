package ValidPerfectSquare;

public class Test {
	public static void main(String[] args) {
		int input = 16;
		// also can try these following input :
		// 5 , 2147483647

		VPS solution = new VPS();
		VPS_ShiftOperation sol = new VPS_ShiftOperation();
		System.out.println("Given input : " + input);
		System.out.println("Implement with binary search : " + solution.isPerfectSquare(input));
		System.out.println("Implement with shift operation : " + sol.isPerfectSquare(input));
	}
}
