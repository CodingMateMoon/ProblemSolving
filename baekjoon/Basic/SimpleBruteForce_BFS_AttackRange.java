import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleBruteForce_BFS_AttackRange {

	static int r;
	static int[] caseX = { -1, 1, 0, 0 };
	static int[] caseY = { 0, 0, -1, 1 };
	
	static class Point {
		int x, y;
		
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split("\\s");
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		r = Integer.parseInt(inputs[2]);
		int[][] arr = new int[n + 1][n + 1];
		
//		arr[x][y] = 77;
		getDistance(n, arr, x, y, 1);
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == x && j == y) 
					sb.append("x ");
				else
					sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

	public static void getDistance(int n, int[][] arr, int x, int y, int distance) {
		if (distance > r)
			return;
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x, y));
		while (!q.isEmpty()) {
			Point p = q.poll();
			for (int i = 0; i < 4; i++) {
	
				int cx = p.x + caseX[i];
				int cy = p.y + caseY[i];
				if (1 <= cx && cx <= n && 1 <= cy && cy <= n) {
					if (arr[cx][cy] == 0) {
						distance = arr[p.x][p.y] + 1;
						if (distance > r)
							return;
						arr[cx][cy] = distance;
						q.add(new Point(cx, cy));
					}
				}
			}
		}
	}

}