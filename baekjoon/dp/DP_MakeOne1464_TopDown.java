package dp;

import java.util.Scanner;

public class DP_MakeOne1464_TopDown {

	static int[] d;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		d = new int[num + 1];
		System.out.println(makeOne(num));
	}

	public static int makeOne(int n) {
		if (n <= 1)
			return 0;

		if (d[n] > 0) {
			return d[n];
		}

		d[n] = makeOne(n - 1) + 1;

		if (n % 2 == 0) {
			d[n] = Math.min(d[n], makeOne(n / 2) + 1);
		}

		if (n % 3 == 0) {
			d[n] = Math.min(d[n], makeOne(n / 3) + 1);
		}
		return d[n];
	}
}
