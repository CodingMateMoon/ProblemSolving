
import java.util.LinkedList;
import java.util.Queue;

public class BFS_pawn {

	public static void main(String[] args)  {

		String[] B = {"..X...", "......", "....X.", ".X....", "..X.X.", "...O.."};
		/*for (String s : B) {
			System.out.println(s);
		}*/
		System.out.println(solution(B));
	}
	
	/*		
	 		B[0] = "..X..."
			B[1] = "......"
			B[2] = "....X."
			B[3] = ".X...."
			B[4] = "..X.X."
			B[5] = "...O.."
	*/
	
	
	
	static int[] dy = {-1, -1};
	static int[] dx = {-1, 1};
	
	public static int solution(String[] B) {
		int y = 0, x = 0, count = 0;
        for (int i = 0; i < B.length; i++) {
        	for (int j = 0; j < B[i].length(); j++) {
        		if (B[i].charAt(j) == 'O') {
        			y = i;
        			x = j;
        			System.out.println(B[i].charAt(j) + " : " + y + " : " + x);
        			break;
        		}
        	}
        }
       
        count = bfs(B, y, x);
        
       
        return count;
    }
	
	public static int bfs(String[] B, int y, int x) {
		
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(y, x, 0));
		int maxCount = 0;
		while (!q.isEmpty()) {
			Point p = q.poll();
			
			for (int i = 0; i < 2; i++) {
				int ny = p.y + dy[i];
				int nx = p.x + dx[i];
				if (checkRange(B, ny, nx) && B[ny].charAt(nx) == 'X') {
					int nny = ny + dy[i];
					int nnx = nx + dx[i];
					if (checkRange(B, nny, nnx) && B[nny].charAt(nnx) == '.') {
						q.add(new Point(nny, nnx, p.count + 1));
						maxCount = Math.max(maxCount, p.count + 1);
					}
				}
			}
		}
		return maxCount;
	}
	
	public static boolean checkRange(String[] B, int y, int x) {
		if (0 <= y && y < B.length && 0 <= x && x < B.length)
			return true;
		else
			return false;
	}
	
	static class Point {
		int y, x, count;
		
		Point(int y, int x, int count) {
			this.y = y;
			this.x = x;
			this.count = count;
		}
	}
}
