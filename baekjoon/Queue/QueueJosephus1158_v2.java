package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJosephus1158_v2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split("\\s");
		int count = 0, n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);
		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < m - 1; j++) {
				q.add(q.poll());
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");
		
		System.out.println(sb);
	}

}
