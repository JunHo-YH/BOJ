import java.util.*;

public class Main {
	public int solution(String str) {
		int answer = 0;
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(str.charAt(i-1) == '(') answer += stack.size();
//				else if(str.charAt(i-1) == ')') answer++;
				else answer++;
			}
		}
		return answer;
		

	}

	public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(M.solution(str));
	}
}