import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}



	public static void main(String[] args) {
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		  
	}
}
