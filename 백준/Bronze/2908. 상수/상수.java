import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String reversed = new StringBuffer(str).reverse().toString();
        
        String[] arr = reversed.split(" ");
        
        int max = -200;
        
        for(int i = 0; i < 2; i++){
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
        }
        
        System.out.println(max);
    }
}