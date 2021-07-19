import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String str2 = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int num1 = Integer.parseInt(sb.append(str).reverse().toString());
		int num2 = Integer.parseInt(sb2.append(str2).reverse().toString());
		System.out.println(num1 > num2 ? num1 : num2);
	
	
	}

}
