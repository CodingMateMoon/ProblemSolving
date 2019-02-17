import java.util.Scanner;

public class NumberTheory_SequenceNum {

	/* 
	 예제 입력
	4
	0 3 6 7
	3 0 5 6
	6 5 0 9
	7 6 9 0
	예제 출력
	2 1 4 5 
	 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[n][n];
		int[] A = new int[n];
		
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split("\\s");
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		A[0] = (arr[0][2] + arr[0][1] - arr[1][2]) / 2;
		for (int i = 1; i < n; i++) {
			A[i] = arr[0][i] - A[0];
		}
		
		for (int i = 0; i < n ; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
