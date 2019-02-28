package CountAndSay;

public class CAS_recursive {
	public String countAndSay(int n) {
		int count = 0;
		String s = "";

		if (n == 1)
			return "1";

		String str = countAndSay(n - 1);
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			s += count;
			s += str.charAt(i);
		}

		return s;
	}
}
