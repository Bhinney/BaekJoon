import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        int[] arr = new int[N]; 
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int M = in.nextInt();
        for(int i = 0; i < M; i++) {
            // 찾고자 하는 값이 있을 경우 1, 없을 경우 0
            if(binarySearch(arr, in.nextInt()) >= 0) {
                sb.append(1 + "\n");
            }
            else {
                sb.append(0 + "\n");
            }
        }
       System.out.println(sb);
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0; // 탐색 범위의 첫번째 인덱스
        int high = arr.length - 1; // 탐색 범위의 마지막 인덱스

        while(low <= high) { 
            int mid = (low + high) / 2;
            // target값이 중간 위치의 값보다 작을 경우
            if(target < arr[mid]) {
                high = mid - 1;
            }
            // target값이 중간 위치의 값보다 클 경우
            else if(target > arr[mid]) {
                low = mid + 1;
            }
            // target값과 중간 위치의 값이 같을 경우
            else {
                return mid;
            }
        }
        return -1;
    }
}