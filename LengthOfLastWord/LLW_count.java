package LengthOfLastWord;

public class LLW_count {
	public int lengthOfLastWord(String s) {
        int lastWordLength = 0;
        if(s == null || s.length() == 0) return lastWordLength;
        int idx = s.length() - 1;
        while (idx >= 0 && s.charAt(idx) == ' ') {
            idx--;
        }

        while (idx >= 0 && s.charAt(idx) != ' ') {
            lastWordLength++;
            idx--;
        }

        return lastWordLength;  
    }
}
