package LengthOfLastWord;

public class LLW_split {
	public int lengthOfLastWord(String s) {
		if (s == null)
			return 0;
		String[] sa = s.split(" ");
		if (sa.length == 0)
			return 0;
		return sa[sa.length - 1].length();
	}
}
