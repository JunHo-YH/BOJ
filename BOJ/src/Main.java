import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[scan.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.next();
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
			System.out.println(sum);

		}
	}
}
