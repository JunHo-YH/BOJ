import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅
		
		if(num < 100) return num;
		else {
			cnt = 99; // 100 이상일 경우 최소 99개이므로
			
			if(cnt == 1000) num = 999; // 예외처리 필수 -> 1000까지 입력가능 && 1000은 등차수열이 아님
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) cnt++; // 각 자릿수가 수열을 이루면
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));
	}
	
}
