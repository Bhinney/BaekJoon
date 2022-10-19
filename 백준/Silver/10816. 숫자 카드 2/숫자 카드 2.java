import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 상근이의 숫자 카드 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // 정렬
        Arrays.sort(arr);
        
        // 구해야 할 숫자 카드
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            int target = sc.nextInt();
            sb.append(higer(arr, target) - lower(arr, target)).append(" ");
        }
        System.out.println(sb);
    }
    
    public static int higer(int[] arr, int target){
        int start = 0;
        int last = arr.length;
        
        while(start < last){
            int mid = (start + last) / 2;
            if(target < arr[mid]){last = mid;}
            else{start = mid + 1;}
        }
        return start;
    }
    
    public static int lower(int[] arr, int target){
        int start = 0; 
        int last = arr.length;
        
        while(start < last){
            int mid = (start + last) / 2;
            if(target <= arr[mid]){
                last = mid;
            }
            else{start = mid + 1;}
        }
        return start;
    }
}