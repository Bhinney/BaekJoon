import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            if(a == 0){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }
        
        int sum = 0;
        
        while(!stack.isEmpty()){
            int num = stack.pop();
            sum += num;
        }
        
        System.out.println(sum);
    }
}