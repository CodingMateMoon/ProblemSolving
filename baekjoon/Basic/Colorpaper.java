import java.util.Scanner;

public class Colorpaper {

	/*
	 * 예제 입력 2 0 0 10 10 2 2 6 6 예제 출력 64 36
	 * 
	 * 
	 * 출처 KOI 2014 전국본선 초등부 1번
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int[n][4];
		int[] areas = new int[n];
		int[][] map = new int[101][101];
		for (int i = 0; i < n; i++) {
			String[] inputs = sc.nextLine().split("\\s");
			for (int j = 0; j < 4; j++) {
				arr[i][j] = Integer.parseInt(inputs[j]);
			}
		}

		for (int i = 0; i < n; i++) {
			checkPaper(map, arr[i][0], arr[i][1], arr[i][2], arr[i][3], i + 1);
		}

//		for (int i = 0; i < 101; i++) {
//			for (int j = 0; j < 101; j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < 101; i++) {
				for (int j = 0; j < 101; j++) {
					if (map[i][j] == k + 1)
						areas[k]++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(areas[i]);
		}

	}

	public static void checkPaper(int[][] map, int x, int y, int width, int height, int num) {
		for (int i = x; i < x + width; i++) {
			for (int j = y; j < y + height; j++) {
				map[i][j] = num;
			}
		}
	}

}
