import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int sum = str.length();
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
            // ABC --> 2
            if(ch >=65 && ch <= 67){sum += 2;}
            
            // DEF --> 3
            if(ch >=68 && ch <= 70){sum += 3;}
            
            // GHI --> 4
            if(ch >=71 && ch <= 73){sum += 4;}
            
            // JKL --> 5
            if(ch >=74 && ch <= 76){sum += 5;}
            
            // MNO --> 6
            if(ch >=77 && ch <= 79){sum += 6;}
            
            // PQRS --> 7
            if(ch >=80 && ch <= 83){sum += 7;}
            
            // TUV --> 8
            if(ch >=84 && ch <= 86){sum += 8;}
            
            // WXYZ --> 9
            if(ch >=87 && ch <= 90){sum += 9;}
        }
        
        System.out.println(sum);
    }
}