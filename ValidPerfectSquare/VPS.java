package ValidPerfectSquare;

public class VPS {
	public boolean isPerfectSquare(int num) {
		int l = 1;
		int r = num;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (mid < num / mid)
				l = mid + 1;
			else if (mid == num / mid && num % mid == 0)
				return true;
			else
				r = mid - 1;
		}
		return false;
	}
}
