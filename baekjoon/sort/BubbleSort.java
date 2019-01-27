import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[100];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		/* 인접한 두 원소씩 비교하며 큰 값이 뒤로 가도록 교환, 가장 끝부터 왼쪽으로 최대값을 위치시키며 정렬
		9 3 2 5 8 10 1 4 6 7
		3 2 5 8 9 1 4 6 7 |10 
		2 3 5 8 1 4 6 7 |9 10 
		2 3 5 1 4 6 7 |8 9 10 
		2 3 1 4 5 6 7 8 9 10 
		2 1 3 4 5 6 7 8 9 10 
		1 2 3 4 5 6 7 8 9 10
		 * */

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = temp;
				}
			}
			
			for (int j = 0; j < n; j++)
				System.out.print(data[j] + " ");
			System.out.println();
		}
	}

}
