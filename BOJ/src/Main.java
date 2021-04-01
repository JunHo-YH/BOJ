import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // 최소값으로 초기화
		String[] ans = str.split(" ");
		for(String x : ans) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
			
		}
		return answer;
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine(); // 한 줄 출력
		Main T = new Main();
		System.out.println(T.solution(str));
	}
}
