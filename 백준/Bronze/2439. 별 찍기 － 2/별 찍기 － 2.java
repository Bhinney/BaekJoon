import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); // N =5;
        
        for(int i = 1; i <= N; i++){
            String result = "";
            for(int j = 1; j <= N-i; j++){ //4
                result += " ";
            }
            for(int k = 1; k <= i; k++){ //1
                result += "*";
            }
            System.out.println(result);
        }
    }
}