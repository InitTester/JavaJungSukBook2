import java.util.*;
// ExpValidCheck
public class Ex11_11 {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		
		System.out.println("expression : " + expression);
		
		try {
			for(int i = 0; i < expression.length(); i ++) {
				char ch = expression.charAt(i);
				
				if(ch=='(') { // '('에서 ')' 까지 값 
					st.push(ch + "");
				} else if(ch==')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 불일치합니다.");				
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 불일치합니다.");
		}
	}
}