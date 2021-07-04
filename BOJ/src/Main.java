import java.util.*;

public class Main {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i = 1; i <= n; i++) Q.offer(i);
		while(!Q.isEmpty()) {
			for(int i = 1; i < k; i++) Q.offer(Q.poll());
			Q.poll();
			if(Q.size() == 1) answer = Q.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(M.solution(n, k));
	
	}
}