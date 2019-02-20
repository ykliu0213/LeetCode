package LongestSubstringWithoutRepeatingCharacters;

public class LSWRC {
	public int lengthOfLongestSubstring(String s) {
		char[] b = new char[s.length()];
		int count = 0,ans = 0;
		for(int i = 0 ; i < s.length() ; i ++) {
			for(int j = i ; j < s.length() ; j++){
                if(!contain(s.charAt(j), b)){
                    b[j] = s.charAt(j);
                    count++;
                }else{
                    b = new char[s.length()];
                    count = 0;
                    break;
                }
                ans = Math.max(ans,count);
            }
		}
		return ans;
    }
	
	public static boolean contain(char a , char[] b) {
		for(int i = 0 ; i < b.length ; i++) {
			if(b[i]==a)
				return true;
		}
		return false;
	}
}
