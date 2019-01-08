import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		label : for (int i = n; i <= m; i++) {
			if (i == 1)
				continue;
			for (int j = 2; j * j <= m; j++) {
				if (i % j == 0) {
					if (i == j) {
						System.out.print(i + " ");
					}
					continue label;
				}
			}
			System.out.print(i + " ");
		}
	}

}
