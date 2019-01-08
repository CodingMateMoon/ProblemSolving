import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int mid = n - 1;
			for (int j = 0; j < 2 * n - 1; j++) {
				if (mid - i <= j && j <= mid + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
