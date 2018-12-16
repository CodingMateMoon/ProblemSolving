package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueJosephus1158 {

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
		while (!q.isEmpty()) {
			count++;
			int temp = q.poll();
			if (count == m) {
				sb.append(temp + ", ");
				count = 0;
			} else {
				q.add(temp);
			}
		}
		int length = sb.length();
		sb.delete(length - 2, length);
		sb.append(">");
		System.out.println(sb);
	}

}
