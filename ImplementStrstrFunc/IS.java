package ImplementStrstrFunc;

public class IS {
	public int strStr(String haystack, String needle) {
		if (haystack.indexOf(needle) != -1)
			return haystack.indexOf(needle);
		else
			return -1;
	}
}
