package CountBinarySubstrings;

public class CBS {
	public int countBinarySubstrings(String s) {
        int count = 0 , pre = 0 , cur = 1;
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i-1) != s.charAt(i)){
                pre = cur;
                cur = 1;
            }else{
                cur++;
            }
            if(pre >= cur){
                count++;
            }
        }
        return count;
    }
}
