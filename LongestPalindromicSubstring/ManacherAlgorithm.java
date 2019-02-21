package LongestPalindromicSubstring;

public class ManacherAlgorithm {
	int start, maxLen;

	public String longestPalindrome(String s) {
		start = 0;
		maxLen = 0;
		char[] str = s.toCharArray();
		for (int i = 0; i < str.length; i++)
			i = check(str, i);
		return s.substring(start, start + maxLen);
	}

	private int check(char[] str, int mid) {
		int left = mid - 1;
		while (mid + 1 < str.length && str[mid] == str[mid + 1])
			mid++;
		int right = mid + 1;
		while (left >= 0 && right < str.length && str[left] == str[right]) {
			left--;
			right++;
		}
		if (maxLen < right - left - 1) {
			maxLen = right - left - 1;
			start = left + 1;
		}
		return mid;
	}
}
