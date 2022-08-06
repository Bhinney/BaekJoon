import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        
        //분이 45보다 작을 때
        if(M < 45){
            //시간이 0일때
            if(H == 0){H = 23; M +=15;}
            
            //시간이 0이 아닐때
            else{H -=1; M += 15;}
        }
        
        //분이 45보다 작지 않을때
        else {M -=45;}
        
        System.out.println(H + " " + M);
    }
}