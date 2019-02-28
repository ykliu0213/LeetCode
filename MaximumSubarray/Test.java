package MaximumSubarray;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		MSA solution = new MSA();
		System.out.println("Given input : " + Arrays.toString(nums));
		System.out.println("Output : " + solution.maxSubArray(nums));
	}
}
