import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        sc.close();
        
        System.out.println(fibo(N));
    }
    
    public static int fibo(int n){
        
        // Base Case
        if(n == 0){return 0;}
        if(n == 1){return 1;}
        else{return fibo(n-1) + fibo(n -2);}
    }
}