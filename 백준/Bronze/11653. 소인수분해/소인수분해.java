import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 소인수 분해 할 숫자
        sc.close();
        
        for(int i = 2; i <= Math.sqrt(num); i++){
            while(num % i == 0){
                System.out.println(i);
                num /= i;
            }
        }
        if(num != 1){
            System.out.println(num);
        }
    }
}