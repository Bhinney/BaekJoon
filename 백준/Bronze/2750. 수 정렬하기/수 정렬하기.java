import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            set.add(a);
        }
        sc.close();
        
        ArrayList<Integer> arr = new ArrayList<>(set);
        Collections.sort(arr);
        
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
}