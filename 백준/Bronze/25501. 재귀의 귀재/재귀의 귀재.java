import java.io.*;
import java.util.*;

public class Main{
    public static int count;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); // 테스트 개수
        
        for(int i = 0; i < T; i++){
            count = 0;
            String str = br.readLine();
            System.out.println(recursion(str, 0, str.length() -1) + " " + count);
        }
    }
    
    // 재귀 호출 횟수 
    public static int recursion(String str, int startIdx, int lastIdx){
        count++;
        if(startIdx >= lastIdx){
            return 1;
        }
        else if(str.charAt(startIdx) != str.charAt(lastIdx)){return 0;}
        else return recursion(str, startIdx+1, lastIdx-1);
    }
}