import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            list.add(br.readLine());
        }
        
        int count = 0;
        
        for(int i = 0; i < m; i++){
            String str = br.readLine();
            
            if(list.contains(str)){count++;}
        }
        br.close();
        
        System.out.println(count);
    }
}