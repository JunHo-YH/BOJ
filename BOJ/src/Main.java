import java.util.Scanner;

public class Main {
	public int solution(int n, int[][] arr) {
		int answer = 0, max = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			int cnt = 0;
			for (int j = 1; j <= n; j++) {
//				if(i != j) 
				for (int k = 1; k <= 5; k++) {
					if (arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if (cnt > max) {
				max = cnt;
				answer = i;
			}

		}
		return answer;

	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n + 1][6]; // 0번은 버림 => 1부터 시작
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));

	}
}