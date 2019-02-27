package FlippingAnImage;

public class FAI {
	public int[][] flipAndInvertImage(int[][] A) {
		int[][] ans = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				ans[i][j] = A[i][A.length - 1 - j];
				if (ans[i][j] == 0)
					ans[i][j] = 1;
				else
					ans[i][j] = 0;
			}
		}
		return ans;
	}
}
