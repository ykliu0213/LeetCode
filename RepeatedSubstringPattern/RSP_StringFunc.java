package RepeatedSubstringPattern;

public class RSP_StringFunc {
	public boolean repeatedSubstringPattern(String s) {
		return (s + s).substring(1, (s + s).length() - 1).contains(s);
	}
}
