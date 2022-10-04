import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        long A = Long.parseLong(st.nextToken()); // 낮에 달팽이가 올라갈 수 있는 길이
        long B = Long.parseLong(st.nextToken()); // 밤에 달팽이가 미끄러지는 길이
        long V = Long.parseLong(st.nextToken()); // 달팽이가 올라갈 막대기의 길이
        
        br.close();
        
        long X = (long) Math.floor((V-B)/(A-B)); // 올라간 날
        
        if((V-B) % (A-B) != 0){X++;}
        
        System.out.println(X);
    }
}