import java.util.Arrays;
import java.util.Scanner;

public class Main { // 2562
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
			if (arr[i] > max) {
				max = arr[i];
				cnt = i + 1;
			}
		}
		System.out.println(max + "\n" + cnt);
	}
}