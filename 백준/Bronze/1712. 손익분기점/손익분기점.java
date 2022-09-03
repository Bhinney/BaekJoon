// A 고정 비용, B 가변 비용, C 노트북 가격
// A + Bx = Cx
// Cx - Bx = A >> x(C-B) = A >> x = A / (C-B)

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        
        if(C <= B){System.out.println(-1);}
        else{
            int x = A / (C-B) + 1;
            System.out.println(x);
        }
    }
}