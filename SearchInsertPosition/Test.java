package SearchInsertPosition;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 5;
		// also can try these following target : 
		// 2 , 7 , 0 
		
		SIP solution = new SIP();
		System.out.println("Given Input : " + Arrays.toString(nums));
		System.out.println("Output : " + solution.searchInsert(nums, target) );
	}
}
