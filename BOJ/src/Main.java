import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int copy = i;
		int cnt = 1;

		while (true) {
			i = ((i % 10) * 10) + (((i / 10) + (i % 10)) % 10);

			if (copy == i)
				break;
			cnt++;
		}
		System.out.println(cnt);
	}
}