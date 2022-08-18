import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int max = -1000000;
        int min = 1000000;
        
        while(st.hasMoreTokens()){
            int x = Integer.parseInt(st.nextToken());
            if(x > max){max = x;}
            if(x < min){min = x;}
        }
        
        System.out.println(min + " " + max);
    }
}