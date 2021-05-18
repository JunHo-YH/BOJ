import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		String str = in.next().toUpperCase();
		char chr = in.next().toUpperCase().charAt(0);
		
		int cnt = 0;
		if(str.length() < 100) {
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == chr) {
					cnt++;
				}
			}
		}else {
			return;
		}
		System.out.println(cnt);
	}



	
}
