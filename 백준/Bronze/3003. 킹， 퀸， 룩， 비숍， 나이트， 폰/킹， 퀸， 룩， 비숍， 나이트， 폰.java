import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] white = new int[6];
        int[] black = {1,1,2,2,2,8};
        
        for(int i = 0; i < white.length ; i++){
            white[i] = sc.nextInt();
            int result = black[i] - white[i];
            System.out.print(result + " ");
        }
    }
}