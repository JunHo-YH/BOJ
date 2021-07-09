class Main {
	public int solution(int num) {
		int answer = 0;
		while (num != 1) {
			if (answer >= 500) {
				answer = -1;
				break;
			}
			if (num % 2 == 0) {
				num = num / 2;
				answer++;
			}
			else {
				num = (num * 3 + 1);
				answer++;
			}
		}
		return answer;
	}
}