import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int find = 97;
		String str = br.readLine();
		for (int i = 97; i < 123; i++) {
			System.out.print(str.indexOf(i) + " ");
		}

	}

}
