import java.util.*;

public class Main {
	public String solution(String str) {
		String answer = "";
		Stack<Character> stack = new Stack<Character>(); // Char형 스택 선언
		for(char x : str.toCharArray()) {
			stack.push(x);
			if(x == ')') {
				while(stack.pop() != '(');
			}
		}
		for(int i = 0; i < stack.size(); i++) answer += stack.get(i);
		return answer;
		}
		
		
		
		public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(M.solution(str));
	}
}