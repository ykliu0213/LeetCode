package StringToInteger;

public class Test {
	public static void main(String[] args) {
		String input = "42";
		// also can try these following input :
		//  "   -42" , "4193 with words" , "words and 987" , "-91283472332" , "20000000000000000000" , " " , "3.14159"
		
		StrToInt solution = new StrToInt();
		StrToIntByChar solutionByChar = new StrToIntByChar();
		System.out.println("Given input : \"" + input + "\"");
		System.out.println("Implement by string : " + solution.myAtoi(input));
		System.out.println("Implement by char : " + solutionByChar.myAtoi(input));
	}
}
