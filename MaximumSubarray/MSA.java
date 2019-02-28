package MaximumSubarray;

public class MSA {
	public int maxSubArray(int[] nums) {
		int prev = nums[0], ans = nums[0];
		for (int i = 1; i < nums.length; i++) {
			prev = Math.max(prev + nums[i], nums[i]);
			ans = Math.max(prev, ans);
		}
		return ans;
	}
}
