import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            switch(st.nextToken()){
                case "push" : stack.push(Integer.parseInt(st.nextToken()));
                    break;
                    
                case "pop" : 
                    if(!stack.empty()) sb.append(stack.pop()).append("\n");
				    else sb.append(-1).append("\n");
                    break;
                    
                case "size" : sb.append(stack.size()).append("\n");
                    break;
                    
                case "empty" : 
                    if(!stack.empty()) sb.append(0).append("\n");
				    else sb.append(1).append("\n");
                    break;
                    
                case "top" : 
                    if(!stack.empty()) sb.append(stack.peek()).append("\n");
				    else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}