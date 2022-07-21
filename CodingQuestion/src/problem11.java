import java.util.Stack;
// parenthesis matching in java
public class problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "(]";
		System.out.println(parenthesisMatch(str));		
		
	}
	
	public static boolean parenthesisMatch(String str) {
		Stack<String> stk = new Stack<>();
		char prev = ' ';
		for(int i = 0; i < str.length(); i++) {
			char str1 =  str.charAt(i);
			if(str1 == '(' ||str1 == '{' || str1 == '[') {
				stk.push(Character.toString(str1));
			}else if(str1 == ')' || str1 == '}' || str1 == ']') {
				if(stk.empty()) {
					return false;
				}
				
				prev = stk.pop().charAt(0);
				switch(str1) {
				case ')':
					if(prev ==  '{' || prev == '[') return false;
					break;
				case '}':
					if(prev ==  '(' || prev == '[') return false;
					break;
				case ']':
					if(prev ==  '{' || prev == '(') return false;
					break;
				}
			}
		}
		
		if(stk.empty()) {
			return true;
		}else {
			return false;
		}
	}

}
