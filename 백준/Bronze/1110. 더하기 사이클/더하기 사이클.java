import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();
        
        int Y = N; // 변수를 하나 더 정해야 같은지 비교 가능.
        
        int count = 0;
        
        while(true){
            N = (N%10)*10 + (((N/10)+(N%10))%10);
            count++;
            
            if(Y == N){break;}
        }
        
        System.out.println(count);
    }
}