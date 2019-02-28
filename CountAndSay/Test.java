package CountAndSay;

public class Test {
	public static void main(String[] args) {
		int n = 4;
		// also can try all the integers less than 30.
		
		CAS_recursive solution = new CAS_recursive();
		CAS_recursive_sb sol = new CAS_recursive_sb();
		System.out.println("Given integer : " + n);
		System.out.println("Implement with recursive : " + solution.countAndSay(n));
		System.out.println("Implement with StringBuilder : " + sol.countAndSay(n));
	}
}
