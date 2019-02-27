package CountBinarySubstrings;

public class Test {
	public static void main(String[] args) {
		String input = "10101";
		// also can try these following input : 
		// "00110011" , "0011100"
		
		CBS solution = new CBS();
		System.out.println("Given input : " + input);
		System.out.println("Output : " + solution.countBinarySubstrings(input));
		
	}
}
