import java.util.Scanner;

public class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); // 대문자로 변환
		t = Character.toUpperCase(t); // 대문자로 변환
		
		for (char c : str.toCharArray()) {
			if (c == t) answer++;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0);
		System.out.println(T.solution(str, c));
	
	}
}
