package LongestCommonPrefix;

public class LCP {
	public String longestCommonPrefix(String[] strs) {
		String ans = new String();
		char temp;

		if (strs == null || strs.length == 0)
			return ans;
		try {
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				temp = strs[0].charAt(i);
				for (int j = 0; j < strs.length; j++) {
					if (temp != strs[j].charAt(i)) {
						return ans;
					}
					if (j == strs.length - 1)
						ans += temp;
				}
			}
		} catch (StringIndexOutOfBoundsException se) {

		}

		return ans;
	}
}
