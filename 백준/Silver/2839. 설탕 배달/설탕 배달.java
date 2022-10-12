import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(num(n));
    }
    public static int num(int n){
        if(n == 4 || n == 7) return -1;
        else if(n % 5 == 0) return n/5;
        else if(n % 5 == 1 || n % 5 == 3) {return (n/5) + 1;}
        else {return (n/5) + 2;}
    }
}