import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        
        for(int i = 0; i < C; i++){
            int student = sc.nextInt();
            double avg = 0;
            int count = 0;
            double avg_stu = 0;
            int[] arr = new int[student];
            
            for(int j = 0; j < student; j++){
                arr[j] = sc.nextInt();
                avg += arr[j];
            }
            avg = avg/student;
            
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > avg){count++;}
            }
            avg_stu = (double)count/student*100;
            
            System.out.println(String.format("%.3f", avg_stu) + "%");
        }
    }
}