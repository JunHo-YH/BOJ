import java.util.*;

public class Main {
	public String solution(int n, int[] arr) {
		String answer = "U";
		Queue<Integer> Q = new LinkedList<Integer>();
		for(int i = 0; i < arr.length; i++) Q.offer(arr[i]);
		while(!Q.isEmpty()) {
			if(Q.contains(Q.poll())) return "D";
		}
		return answer;

	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n, arr));
	}
}