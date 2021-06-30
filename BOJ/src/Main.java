import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			int lv = 1;
			for (int k = 0; k < n; k++) {
				if (arr[i] < arr[k])
					lv++;
			}
			answer[i] = lv;
		}

		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		for (int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}

	}
}