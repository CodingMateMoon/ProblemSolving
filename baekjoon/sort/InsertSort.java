package sort;

import java.util.Scanner;

public class InsertSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		/* 
		9 3 2 5 1 4 6 7 8 10
		j = 0
		j 앞에 있는 원소와 비교해야하는데 j가 0일때는 앞의 원소가 존재하지않으므로 j=1일때까지만 값을 비교
		9 3 2 5 1 4 6 7 8 10
		   j = 1
		3 9 2 5 1 4 6 7 8 10
		      j = 2  ---- 9<->2 , 3<->2
		2 3 9 5 1 4 6 7 8 10
				 j = 3
		2 3 5 9 1 4 6 7 8 10 
		 		   j = 4 ------- 9 <-> 1, 5 <-> 1, 3 <-> 1, 2 <-> 1
		1 2 3 5 9 4 6 7 8 10 
		              j = 5 ------ 9 <-> 4, 5 <-> 4
		1 2 3 4 5 9 6 7 8 10
		 * */
		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 1; j--) {
				if (data[j - 1] > data[j]) {
					int temp = data[j - 1];
					data[j - 1] = data[j];
					data[j] = temp;
				}
				else
					break;
			}
			
			for (int j = 0; j < n; j++) {
				System.out.print(data[j] + " ");
			}
			System.out.println();
		}
	}

}
