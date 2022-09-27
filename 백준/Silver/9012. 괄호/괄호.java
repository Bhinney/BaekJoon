import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++){
            System.out.println(solution(sc.next()));
        }
    }
    public static String solution(String str){
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(a == '('){
                stack.push(a);
            }
            else if(a == ')' && !stack.isEmpty()){
                stack.pop();
            }
            else{return "NO";}
        }
        
        if(stack.isEmpty()){return "YES";}
        else{return "NO";}
    }
}