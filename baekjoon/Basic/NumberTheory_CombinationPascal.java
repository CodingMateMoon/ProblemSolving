import java.util.Scanner;

public class NumberTheory_CombinationPascal {

	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[n + 1][n + 1];
		System.out.println(getPascal(n, m));
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
