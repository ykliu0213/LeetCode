package TwoSum;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		
		TwoSum ts = new TwoSum();
		TwoSumHashMap tsHashMap = new TwoSumHashMap();
		System.out.println("Given nums : " + Arrays.toString(nums));
		System.out.println("Target : " + target);
		System.out.println("implement with brute-force : " + Arrays.toString(ts.twoSum(nums, target)));
		System.out.println("implement with hashmap : " + Arrays.toString(tsHashMap.twoSum(nums, target)));
	}
}
