import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        br.close();
        
        int[] arr = new int[str.length()];
        
        for(int i = 0; i < arr.length ; i++){
            arr[i] = Character.getNumericValue(str.charAt(i));
        }
        
        Arrays.sort(arr);
        
        String result = "";
        for(int i = arr.length-1; i >=0; i--){
            result += String.valueOf(arr[i]);
        }
        System.out.println(result);
    }
}