import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	public String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE, pos;
		
		while((pos = str.indexOf(" ")) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
			if(str.length() > max) answer = str;
		
		}
//		while((pos = str.indexOf(' ')) != -1) {
//			String tmp = str.substring(0, pos);
//			int len = tmp.length();
//			if(len > max) {
//				max = len;
//				answer = tmp;
//			}
//			str = str.substring(pos+1);
//			System.out.println(str);
//		}
//		
		return answer;
	}

	public static void main(String[] args) {

		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}
}