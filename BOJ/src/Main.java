import java.io.*;
import java.util.*;

public class Main {// 2577
	public static void main(String[] args) throws IOException {
		int max = 0;
		int index = 0;
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[9];
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int value : arr) {
			count++;
			if (value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max);
		System.out.println(index);

	}
}