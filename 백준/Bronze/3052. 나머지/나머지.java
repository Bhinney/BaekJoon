import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       HashSet<Integer> num = new HashSet<>();

       for(int i =0; i < 10; i++){
           int a = sc.nextInt();
           num.add(a%42);
       }
       sc.close();

       System.out.println(num.size());
    }
}
