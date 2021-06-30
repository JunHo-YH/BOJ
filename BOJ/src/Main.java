import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public int solution(int n, int[][] arr) {
		int answer = Integer.MIN_VALUE;
		int sum1 = 0, sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum1 = sum2 = 0;
			for(int k = 0; k < n; k++) {
				sum1 += arr[i][k];
				sum2 += arr[k][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1 = sum2 = 0;
		for(int i = 0; i < n; i++) {
			sum1 += arr[i][i];
			sum2 += arr[i][n-i-1];
		}
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));

	}
}