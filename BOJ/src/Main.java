import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			answer += str.charAt(str.length()-i-1);
		}
		return answer;
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Main T = new Main();
		for (int i = 1; i <= n; i++) {
			String str = scan.next();
			System.out.println(T.solution(str));
		}
	}
}
