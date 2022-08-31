import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            // c=. c-
            if(ch == 'c' && i < str.length() -1 ){
                if(str.charAt(i+1) == '=' || str.charAt(i+1) == '-'){i++;}
            }
            
            // dz=, d-
            if(ch == 'd' && i < str.length() -1 ){
                if(str.charAt(i+1) == 'z' && i < str.length() -2 ){
                    if(str.charAt(i+2)=='='){i +=2;}
                }
                else if(str.charAt(i+1) == '-'){i++;}
            }
            
            // lj
            if(ch == 'l' && i < str.length() -1 ){
                if(str.charAt(i+1) == 'j'){i++;}
            }
            
            // nj
            if(ch == 'n' && i < str.length() -1 ){
                if(str.charAt(i+1) == 'j'){i++;}
            }
            
            // s=
            if(ch == 's' && i < str.length() -1 ){
                if(str.charAt(i+1) == '='){i++;}
            }
            
            // z=
            if(ch == 'z' && i < str.length() -1 ){
                if(str.charAt(i+1) == '='){i++;}
            }
            count++;
        }
        
        System.out.println(count);
    }
}