import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int i = 0; i < T; i++){
            int R = sc.nextInt();
            String str = sc.next();
            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                for(int k = 0; k < R; k++){
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}