import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    //카드 개수
        int M = sc.nextInt();    //블랙잭 (넘지않고 가까워야 하는 수)
        int sum = 0;        //세 수의 합
        int tmp = 0;         //새로운 근사치가 나올때까지 이전 근사치 값
        
        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();    //카드에 적힌 수
        }
        sc.close();
        
        for(int i=0; i<N; i++) {            //N만큼 반복(배열 arr을 순회)
            for(int j=i+1; j<N; j++) {        //i+1번째 위치한 arr부터 순회
                for(int k=j+1; k<N; k++) {    //j+1번째부터 arr 순회
                    sum = arr[i] + arr[j] + arr[k];    //세 수를 더한다.
                    if(tmp < sum && sum <= M)        
                        tmp = sum;
                }
            }
        }
        System.out.println(tmp);    //for문을 다 돌고 가장 근접한 근사치는 tmp에 있다.
    }
}