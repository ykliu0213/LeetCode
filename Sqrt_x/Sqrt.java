package Sqrt_x;

public class Sqrt {
	public int mySqrt(int x) {
		int l = 1;
		int r = x;
		int ans = 0;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (mid <= x / mid) {
				l = mid + 1;
				ans = mid;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}
}
