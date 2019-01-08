import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		int r = 0, c = 0, val = 0;
		for (int i = 0; i < n; i++) {
			int x = 0;
			int y = c;
			do {
				arr[x][y] = ++val;
				x++;
				y--;
			} while (y >= 0);
			c++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
