import java.util.Scanner;

public class SimpleBruteForce_Rectangle {
	
	/* 
	 예제 입력
	1 2 4 4
	2 3 5 7
	3 1 6 5
	7 3 8 6
	예제 출력
	26
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] rectangle = new int[4][4];
		int[][] map = new int[101][101];
		for (int i = 0; i < 4; i++) {
			String[] input = sc.nextLine().split("\\s");
			for (int j = 0; j < input.length; j++) {
				rectangle[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			int x = rectangle[i][0];
			int y = rectangle[i][1];
			int x2 = rectangle[i][2];
			int y2 = rectangle[i][3];
			
			for (int j = x; j < x2; j++) {
				for (int k = y; k < y2; k++) {
					map[j][k] = 1;
				}
			}
		}
		
		int count = 0;
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				
				if (map[i][j] == 1)
					count++;
			}
		}
		System.out.println(count);
	}
	
}
