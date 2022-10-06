import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        
        int[] coin = new int[n];
        
        for(int i = n-1; i >=0; i--){
            coin[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i < n; i++){
            if(k > 0){
                int count = (int) Math.floor(k/coin[i]);
                result += count;
                k = k - coin[i]*count;
            }
        }
        
        System.out.println(result);
    }
}