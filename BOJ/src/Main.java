import java.util.*;

public class Main {
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] tmp = arr.clone();// arr에는 영향을 주지 않는 배열 생성
		Arrays.sort(tmp);// 오름차순 정렬
		for(int i = 0; i < n; i++) {
			if(arr[i] != tmp[i]) answer.add(i+1);
		}
		
		return answer;

	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
	}
}