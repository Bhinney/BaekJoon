import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); //  수의 개수 N
        int M = sc.nextInt(); // 합을 구해야 하는 횟수 M
        
        int[] arr = new int[N + 1]; // 수를 넣을 배열
        
        
        for(int i = 1; i <= N; i++){
            arr[0] = 0;
            arr[i] = arr[i-1] + sc.nextInt(); // 누적 합을 배열로 넣는다
        }
        
        for(int i = 0; i < M; i++){
            int start = sc.nextInt();
            int last = sc.nextInt();
            
            System.out.println(arr[last] - arr[start-1]);
        }
    }
}