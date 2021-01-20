import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			h.add(scan.nextInt() % 42);
		}

		scan.close();
		System.out.println(h.size());

	}
}
