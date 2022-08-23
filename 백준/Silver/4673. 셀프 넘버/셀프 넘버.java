import java.util.*;

public class Main{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        for(int i =1; i <= 10000; i++){
            int num = selfNum(i);

            if(num <= 10000){set.add(num);}
        }

        for(int i =1; i <= 10000; i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static int selfNum(int n){

        int sum = n;

        while(n != 0){
            sum += n%10;
            n = n/10;
        }

        return sum;
    }
}