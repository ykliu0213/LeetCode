package RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 1, 2, 3, 3, 4 };

		RDFSA solution = new RDFSA();
		System.out.println("Given input : " + Arrays.toString(nums));
		int len = solution.removeDuplicates(nums);
		System.out.print("Output : [");
		for (int i = 0; i < len; i++) {
			if (i == len - 1)
				System.out.print(nums[i]);
			else
				System.out.print(nums[i] + ", ");
		}
		System.out.println("]");
	}
}
