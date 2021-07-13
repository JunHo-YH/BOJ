import java.io.BufferedReader;

public class Main {

	public static int d(int number) {

		int sum = number;

		while (number != 0) {
			sum = sum + (number % 10); // 첫 쨰 자리수
			number = number / 10; // 10을 나누어 첫 째 자리를 없앤다.
		}

		return sum;
	}

	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; // 1부터 10000까지
		for (int i = 0; i < 10001; i++) {
			int n = d(i);
			if(n < 10001) check[n] = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if (!check[i]) sb.append(i).append('\n');
		}
		System.out.println(sb);
		
	}

}
