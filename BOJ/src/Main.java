import java.util.*;

public class Main {
	public int solution(String str) {
		int answer = 0;
		int sum = 0;
		int lt = 0, rt = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				rt = stack.pop();
				lt = stack.pop();
				if(x == '+') stack.push(lt + rt);
				else if(x == '-') stack.push(lt - rt);
				else if(x == '*') stack.push(lt * rt);
				else if(x == '/') stack.push(lt / rt);
			
			
			} 
		}
		return answer = stack.get(0);	

	}

	public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(M.solution(str));
	}
}