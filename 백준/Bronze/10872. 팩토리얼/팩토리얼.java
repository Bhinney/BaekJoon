import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(fact(n));
    }
    
    public static int fact(int num){
        
        // Base Case
        if(num == 0){return 1;}
        
        // Recursion Case
        else{return fact(num-1) * num;}
    }
}