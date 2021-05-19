import java.util.*;

class Main {
    
    public String solution(String[] seoul) {
        
    	List<String> arrList = Arrays.asList(seoul);
        int index = arrList.indexOf("Kim");        
        String answer = "김서방은 " + index + "에 있다";
        
        
        
        return answer;
        
        
        
    }
}