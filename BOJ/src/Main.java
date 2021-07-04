import java.util.*;

public class Main {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<Character>();
		for(char x : s1.toCharArray()) Q.offer(x);
		for(char x : s2.toCharArray()) {
			if(Q.contains(x)) {
				if(Q.poll() != x) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		
		return answer;
	}

	public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(M.solution(s1, s2));

	}
}