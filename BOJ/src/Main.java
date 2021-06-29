import java.util.Scanner;

public class Main {
	public int solution(int n) {
		int answer = 0;
		int[] ch = new int[n+1]; // 해당 수까지 포함하려면 index+1
		for(int i = 2; i <= n; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j = i; j <= n; j = j + i) ch[j] = 1;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(T.solution(n));
	}
}