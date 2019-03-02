package PlusOne;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] digits = {1,2,3,4};
		// also can try these following input : 
		// {9,9,9} , {5,9}
		
		PS solution = new PS();
		System.out.println("Given input : " + Arrays.toString(digits));
		System.out.println("Output : " + Arrays.toString(solution.plusOne(digits)));
	}
}
