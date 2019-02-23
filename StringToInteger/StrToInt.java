package StringToInteger;

import java.util.regex.Pattern;

public class StrToInt {
	public int myAtoi(String str) {
		if(str.length() == 0 || str.charAt(0) == '.')
			return 0;
		
		boolean isNegative = false;
		String[] strArray = str.split(" |\\.");
		int index = 0;
		
		if (strArray.length == 0)
			return 0;
		
		while (isInteger(strArray[index])||strArray[index].length()==0) {
			if(strArray[index].length()==0) {
				index++;
				continue;
			}
			if (strArray[index].charAt(0) == '-')
				isNegative = true;
			try {
				return Integer.parseInt(strArray[index]);
			} catch (NumberFormatException ex) {
				return (isNegative) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
		}
		return 0;
	}

	public boolean isInteger(String s) {
		Pattern pattern = Pattern.compile("^[-\\+]?[\\d]+$");
		return pattern.matcher(s).matches();
	}
}
