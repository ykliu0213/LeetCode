package StringToInteger;

public class Test {
	public static void main(String[] args) {
		String input = ".1";
		// also can try these following input :
		//  "   -42" , "4193 with words" , "words and 987" , "-91283472332" , "20000000000000000000" , " " , "3.14159"
		
		StrToInt solution = new StrToInt();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement with brute-force : " + solution.myAtoi(input));
	}
}
