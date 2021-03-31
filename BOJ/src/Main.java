import java.util.Scanner;

public class Main {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos; // 최소값으로 초기화
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
			if(str.length() > m) answer = str;
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Main T = new Main();
		System.out.println(T.solution(str));
	
	
	}
}
