import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class DFS_BFS_ConnectedComponent {
    public int solution(int[] A) {
    	if (A.length == 0)
			return 0;
		boolean[] check = new boolean[A.length];
		int maxLength = 0;
		for (int i = 0; i < A.length; i++) {
			if (!check[i]) {
				int length = dfs(A, check, i, 1);
				System.out.println(length);
				maxLength = Math.max(maxLength, length);
			}
		}
		return maxLength;
    }
    
    public static int dfs(int[] A, boolean[] check, int x, int count) {
		if (check[x]) 
			return count - 1;
		check[x] = true;
		int result = dfs(A, check, A[x], count + 1);
		return result;
	}
    
    public static int bfs(int[] A, boolean[] check, int x) {
		Queue<Integer> q = new LinkedList<>();
		check[x] = true;
		q.add(x);
		int cnt = 1;
		while (!q.isEmpty()) {
			int p = q.poll();
			if (! check[A[p]]) {
				check[A[p]] = true;
				q.add(A[p]);
				cnt++;
			}
		}
		return cnt;
	}
}