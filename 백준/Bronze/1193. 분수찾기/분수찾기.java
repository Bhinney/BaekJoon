import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        
        int crossCount = 1;
        int sum = 0;
        
        while(true){
            if(X <= sum + crossCount){
                if(crossCount % 2 == 1){ // 홀수라면
                    System.out.print((crossCount - (X - sum - 1)) + "/" + (X - sum));
					break;
                }
                else {
                    System.out.print((X - sum) + "/" + (crossCount - (X - sum - 1)));
					break;
                }
            }
            else {
				sum += crossCount;
				crossCount++;
			}
        }
        
    }
}