package CountAndSay;

public class CAS_recursive_sb {
	public String countAndSay(int n) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char c = '0';

		if (n == 1)
			return "1";

		String str = countAndSay(n - 1);

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			c = str.charAt(i);
			while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
				count++;
				i++;
			}
			sb.append(count + "" + c);
		}

		return sb.toString();
	}
}
