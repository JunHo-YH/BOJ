import java.util.*;

class Solution {
    public int[] solution(int[] deposit) {
        int[] answer = new int[deposit.length];
        Stack<Integer> stack = new Stack<>();
        for(int bank : deposit) {
            int calc = 0;
            if(bank >= 0) stack.push(bank);
            else {
                while(calc <= 0) {
                int money = stack.pop();
                calc =  bank + money;
                bank = calc;
                }
                stack.push(calc);
            }
        }
        for(int i = 0; i <stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Solution rs = new Solution();

        int[] arr = {500,1000,-300,200,-400,100,-100};
        System.out.println(rs.solution(arr));
    }
}