import java.util.*;

public class Main {
	public int solution(int n, int k, int[] arr) {
		int answer = 0, cnt = 0, lt = 0;
		for(int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
			System.out.print(rt-lt+1 + " ");
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, k, arr));
	}
}