import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = new String[scan.nextInt()];
		s = br.readLine().split(" ");
		int[] num= new int[s.length];
		
		for (int i = 0; i < s.length; i++) {
			num[i] = Integer.parseInt(s[i]);
		}
		
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[num.length-1]);
		
		
		
		
		
		
		
		
	}
}