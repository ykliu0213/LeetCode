package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class LSWRCHashSet {
	public int lengthOfLongestSubstring(String s) {
		Set<Character> subString = new HashSet<>();
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!subString.contains(s.charAt(i))) {
				subString.add(s.charAt(i));
				ans++;
			}
		}
		return ans;
	}
}
