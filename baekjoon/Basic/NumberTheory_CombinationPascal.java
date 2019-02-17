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

}
