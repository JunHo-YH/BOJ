import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int test_case = Integer.parseInt(br.readLine()); // 테스트 케이스

		String arr[] = new String[test_case];

		for (int i = 0; i < test_case; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < test_case; i++) {
			int cnt = 0;
			int sum = 0;

			for (int k = 0; k < arr[i].length(); k++) {
				if (arr[i].charAt(k) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);

	}
}
