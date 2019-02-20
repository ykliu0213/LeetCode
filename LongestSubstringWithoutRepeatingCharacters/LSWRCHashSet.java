package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class LSWRCHashSet {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> subString = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < s.length() && j < s.length()) {
			if (!subString.contains(s.charAt(j))) {
				subString.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				subString.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
