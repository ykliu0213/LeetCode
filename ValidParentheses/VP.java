package ValidParentheses;

import java.util.Stack;

public class VP {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		String leftSide = "({[";
		String rightSide = ")}]";
		
		for(char c : s.toCharArray()) {
			if(leftSide.indexOf(c) > -1)
				stack.push(c);
			else if (stack.isEmpty() || leftSide.indexOf(stack.pop()) != rightSide.indexOf(c))
				return false;
		}
		return stack.isEmpty();
	}
}
