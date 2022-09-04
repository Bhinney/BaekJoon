import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        Arrays.sort(arr);
        
        System.out.println(arr[arr.length-X]);
    }
}