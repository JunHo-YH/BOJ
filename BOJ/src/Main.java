import java.util.Scanner;

public class Main {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase(); // 대문자로 변환
		t = Character.toUpperCase(t); // 문자를 대문자로 변환
//		System.out.println(str + " " + t);
//		for(int i = 0; i < str.length(); i++) {
//			if(str.charAt(i) == t) answer++;
//		}
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
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