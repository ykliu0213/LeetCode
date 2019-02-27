package RepeatedSubstringPattern;

public class RSP {
	public boolean repeatedSubstringPattern(String s) {
		int l = s.length();
		for (int i = l / 2; i > 0; i--) {
			if (l % i == 0) {
				String sub = s.substring(0, i);
				for (int j = 0; j <= l; j = j + i) {
					if (j == l)
						return true;
					if (!sub.equals(s.substring(j, j + i)))
						break;
				}
			}
		}
		return false;
	}
}
