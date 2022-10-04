import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken()); // 낮에 달팽이가 올라갈 수 있는 길이
        int B = Integer.parseInt(st.nextToken()); // 밤에 달팽이가 미끄러지는 길이
        int V = Integer.parseInt(st.nextToken()); // 달팽이가 올라갈 막대기의 길이
        
        br.close();
        
        int X = (int)Math.ceil(((double)(V-B)/(double)(A-B)));// 올라간 날
                
        System.out.println(X);
    }
}