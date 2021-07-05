import java.util.*;

public class Main {
	public int[] solution(int n, int[] arr) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Main M = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
		for(int x : M.solution(n, arr)) System.out.print(x + " ");
			
		
	}
}