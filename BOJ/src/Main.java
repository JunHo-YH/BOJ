import java.util.Scanner;

public class Main {
	public int solution(String str, char c) {
		int answer = 0;
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		if(str.length() < 100) {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == c) {
					answer++;
				}
			}
			return answer;
		}else {
			return -1;
		}
	}
	public static void main(String[] args) {
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0);
		
		System.out.println(m.solution(str, c));
	}



	
}
