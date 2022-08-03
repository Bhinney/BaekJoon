import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        
        /* B를 385라 가정할 때 
        일의 자리 구하기 >> 일의자리 5를 구해야함, 385를 10으로 나누면 나머지가 5가 됨.
        십의 자리 구하기 >> 385를 100으로 나누면 나머지가 85가 됨, 85를 10으로 나누면 8만 남음.
        백의자리 구하기 >> 385를 100으로 나누면, 3만 남음
        */
        System.out.println(A * (B%10));
        System.out.println(A * (B%100/10));
        System.out.println(A * (B/100));
        System.out.println(A * B);
        
    }
}