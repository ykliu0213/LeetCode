package StringToInteger;

public class StrToIntByChar {
	public int myAtoi(String str) {
		if (str == null || str.length() == 0)
			return 0;
		
		int sum = 0, sign = 1, i = 0;
		
		while (i < str.length() && str.charAt(i) == ' ')
			i++;
		if (str.length() == i)
			return 0;
		if (str.charAt(i) == '-' || str.charAt(i) == '+') {
			sign = str.charAt(i) == '-' ? -1 : 1;
			i++;
		}
		
		while (i < str.length() && Character.isDigit(str.charAt(i))) {
			if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7))
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			sum = sum * 10 + (str.charAt(i) - '0');
			i++;
		}
		return sum * sign;
	}
}
