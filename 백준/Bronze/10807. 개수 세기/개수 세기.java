import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		// 배열의 개수
		int n = sc.nextInt();

		// 배열에 넣기
		for(int i = 0; i < n; i++){
			list.add(sc.nextInt());
		}
		int v = sc.nextInt();
		sc.close();

		int count = (int)list.stream()
			.filter(num -> num == v)
			.count();

		System.out.println(count);
	}
}
