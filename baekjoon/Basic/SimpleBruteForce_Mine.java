import java.util.Scanner;

public class SimpleBruteForce_Mine {
	
	/* 예제 입력
	9 8
	4 5
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 1 0 0 0 0
	0 0 0 0 0 1 0 0
	0 0 0 1 0 1 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	예제 출력
	4
	 
	
	예제 입력
	9 8
	4 6
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 1 0 0 0 0
	0 0 0 0 0 1 0 0
	0 0 0 1 0 1 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	0 0 0 0 0 0 0 0
	예제 출력
	game over*/

	static int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		x -= 1;
		y -= 1;
		sc.nextLine();

		boolean[][] map = new boolean[n][m];
		int count = 0;

		for (int i = 0; i < n; i++) {
			String[] inputs = sc.nextLine().split("\\s");
			for (int j = 0; j < m; j++) {
				if (inputs[j].equals("0"))
					map[i][j] = false;
				else
					map[i][j] = true;
			}
		}

		game(map, n, m, x, y);

		// for (int i = 0; i < n; i++) {
		// for (int j = 0; j < m; j++) {
		// if (map[i][j])
		// System.out.print(1 + " ");
		// else
		// System.out.print(0 + " ");
		// }
		// System.out.println();
		// }
	}

	public static void game(boolean[][] map, int n, int m, int x, int y) {
		int count = 0;
		if (map[x][y]) {
			System.out.println("game over");
			return;
		}
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (0 <= nx && nx <= n && 0 <= ny && ny <= m) {
				if (map[nx][ny])
					count++;
			}
		}
		System.out.println(count);
	}

}
