package TwoSum;

import java.util.*;

public class TwoSumHashMap {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numMap = new HashMap<>();
		for(int i = 0 ; i < nums.length ; i++) {
			int content = target - nums[i];
			if(numMap.containsKey(content)) {
				return new int[] {numMap.get(content),i};
			}
			numMap.put(nums[i],i);
		}
		throw new IllegalArgumentException("no two sum solution");
	}
}
