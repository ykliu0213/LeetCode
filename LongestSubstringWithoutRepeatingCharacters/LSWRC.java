package LongestSubstringWithoutRepeatingCharacters;

public class LSWRC {
	public int lengthOfLongestSubstring(String s) {
		char[] b = new char[s.length()];
		int count = 0;
		for(int i = 0 ; i < s.length() ; i ++) {
			if(!contain(s.charAt(i), b)) {
				count++;
				b[i] = s.charAt(i);
			}
		}
		return count;
    }
	
	public static boolean contain(char a , char[] b) {
		for(int i = 0 ; i < b.length ; i++) {
			if(b[i]==a)
				return true;
		}
		return false;
	}
}
