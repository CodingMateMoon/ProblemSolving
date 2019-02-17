import java.util.Scanner;

public class NumberTheory_CombinationPascal {

	/*
	 예제 입력 (5 C 2 ) n C m
	5 2
	예제 출력
	10
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		double result = 1;
		if (n == 0 || m == 0 || n == 1) {
			System.out.println(1);
			return;
		}
		
		for (int i = 0; i < m; i++) {
			result *= (double) (n - i) / (m - i);
		}
		System.out.println((int) result);
	}
	
	public static int getPascal(int n, int m) {
		if (arr[n][m] != 0)
			return arr[n][m];
		if (n == 0 || n == 1 || m == 0 || n == m) {
			arr[n][m] = 1;
			return 1;
		} if (m == 1) {
			arr[n][m] = n;
			return arr[n][m];
		} 
		
		arr[n][m] = getPascal(n - 1, m - 1) + getPascal(n - 1, m);
		return arr[n][m];
	}

}
