import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        float avg = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++){
            avg += (arr[i]/arr[n-1] * 100) / n;
        }
        
        System.out.println(avg);
    }
}