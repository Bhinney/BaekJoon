import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); // 현재 시각 : 23
        int B = sc.nextInt(); // 현재 분 : 50
        int C = sc.nextInt(); // 맞추는 시간 : 150 (두시간 반) --> 1시 20분
        sc.close();
        
        int hour = A + (B + C)/60;
        int min = (B + C) % 60;
        
        if(hour >= 24) hour-=24;
        
        System.out.println(hour + " " + min);
    }
}