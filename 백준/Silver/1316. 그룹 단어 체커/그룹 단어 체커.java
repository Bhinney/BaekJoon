import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int k = 0; k < N; k++){
            String str = br.readLine();
            char ch = str.charAt(0);
            ArrayList<Character> list = new ArrayList<>();
            ArrayList<String> visited = new ArrayList<>();
            
            // 입력 된 문자열의 길이만큼 비교
            for(int i = 1; i < str.length(); i++){
                if(ch != str.charAt(i)){
                    list.add(ch);
                    ch = str.charAt(i);
                    if(list.contains(ch)){visited.add("yes");}
                }
            }
            
            if(!visited.contains("yes")){count++;}
        }
        
        System.out.println(count);
    }
}