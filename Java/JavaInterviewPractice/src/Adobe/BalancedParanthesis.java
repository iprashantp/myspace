package Adobe;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		BalancedParanthesis obj = new BalancedParanthesis();
		String s="(()))";
		if(obj.isBalanced(s))
			System.out.println("Yes");
		else
			System.out.println("No");
		return;
	}
	private boolean isBalanced(String s){
		int len=s.length();
		char[]charArr = s.toCharArray();
		Stack <Character> stack = new Stack<Character>();
		for(int i=0;i<len;i++){
			switch (charArr[i]){
			case '[':
				stack.push('[');
				break;
			case ']':
				if(stack.isEmpty()==true)
					return false;
				else if(stack.peek()=='[')
					stack.pop();
				else
					return false;
				break;
			case '{':
				stack.push('{');
				break;
			case '}':
				if(stack.isEmpty()==true)
					return false;
				else if(stack.peek()=='{')
					stack.pop();
				else
					return false;
				break;
			case '(':
				stack.push('(');
				break;
			case ')':
				if(stack.isEmpty()==true)
					return false;
				else if(stack.peek()=='(')
					stack.pop();
				else
					return false;
				break;
			default:
				continue;
			}
				
		}
		if(stack.isEmpty()==true)
			return true;
		return false;
	}

}
