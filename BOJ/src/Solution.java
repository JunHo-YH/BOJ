import java.util.Scanner;

public class Solution {
	public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < gift_cards.length; i++) {
            for (int k = 0; k < wants.length; k++) {
                if (gift_cards[i] == wants[k]) {
                    count++;
                }
            }
        }
        
        
        
        return answer;
    }

	public static void main(String[] args) {
		 
	    Solution sol = new Solution();
	    Scanner scan = new Scanner(System.in);
	    int people = scan.nextInt();
	    int[] gift_cards = new int[people];
	    int[] wants = new int[people];
	    for (int i = 0; i < gift_cards.length; i++) {
	        gift_cards[i] = scan.nextInt();
	    }
	    for (int i = 0; i < gift_cards.length; i++) {
	    	wants[i] = scan.nextInt();
	    	
	    	
	    }
	       
	    System.out.println(sol.solution(gift_cards, wants) );
	}

}
