package RemoveElement;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2};
		int val = 2;

		RE solution = new RE();
		System.out.println("Given input : " + Arrays.toString(nums));
		int len = solution.removeElement(nums, val);
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
