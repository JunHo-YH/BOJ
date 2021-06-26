import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		for (String x : str) {
			char[] s = x.toCharArray(); // 문자열을 문자 배열로 변환
			int lt = 0, rt = x.length() - 1;
			while (lt < rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);

		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		for (String s : T.solution(n, str)) {
			System.out.println(s);
		}
	}
}
