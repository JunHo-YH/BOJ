import java.util.Scanner;

public class Main {
	public String solution(String str) {
		
		String[] arrStr = str.split(" ");
		int strLen = 0;
		for(String len : arrStr) {
			if(len.length() > strLen) {
				strLen = len.length();				
			}
			
		}
		for(String len : arrStr) {
			if(len.length() == strLen) {
				str = len;
			}
		}
		
		
		return str;
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(str.length() < 100) {
			System.out.println(m.solution(str));
		}
		
	}



	
}
