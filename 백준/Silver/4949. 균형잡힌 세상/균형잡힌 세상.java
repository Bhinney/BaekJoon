import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true) {		
			String s = sc.nextLine();
			
			if(s.equals(".")) {	
				break;
			}		
			System.out.println(solution(s));
		}
    }
    
    public static String solution(String str){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            
            if(a == '(' || a == '['){stack.push(a);}
            
            if(a == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return "no";
                }
                else{stack.pop();}
            }
            
            if(a == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                }
                else{stack.pop();}
            }
            
        }
        
        if(stack.isEmpty()){return "yes";}
        else{return "no";}
    }
}