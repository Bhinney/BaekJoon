import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt(); // 영수증의 값
        int N = sc.nextInt(); // 물건 종류의 수
        
        int total = 0;
        
        for(int i=0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            total = total + a * b;
        }
        
        if(total == M) {System.out.println("Yes");}
        else {System.out.println("No");}
    }
}