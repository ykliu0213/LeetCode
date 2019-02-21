package LongestPalindromicSubstring;

public class LPS {
	public String longestPalindrome(String s) {
		String ans = "";
		if (s.length() == 1) {
			return s;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j <= s.length(); j++) {
				if (isPalindrome(s.substring(i, j))) {
					if (s.substring(i, j).length() > ans.length())
						ans = s.substring(i, j);
				}
			}
		}
		return ans;
	}

	public boolean isPalindrome(String s) {
		String res = new StringBuilder(s).reverse().toString();
		return res.equals(s);
	}
}
