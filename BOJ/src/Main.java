import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[scan.nextInt()];

		int max = 0;
		double total = 0;
		double score = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			total += (arr[i] / (double) max) * 100 / arr.length;
		}
		System.out.println(total);

	}
}
