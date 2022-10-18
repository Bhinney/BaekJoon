import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 포켓몬 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        // 입력될 문제 개수
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, String> map = new HashMap<>();
        map.put(" ", " ");
        for(int i = 1; i <= n; i++){
            String a = br.readLine();
            String num = String.valueOf(i);
            
            map.put(a, num);
            map.put(num, a);
        }
        
        StringBuilder sb = new StringBuilder(m);
        for(int i = 0; i < m; i++){
            sb.append(map.get(br.readLine()) + "\n");
        }
        
        System.out.print(sb);
    }
}