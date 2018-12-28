package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_123Plus_9095 {

	public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int[] d = new int[11];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		for (int i = 4; i < 11; i++) {
			d[i] = d[i - 1] + d[i - 2] + d[i - 3];
		}
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(d[n]);
		}
	}

}
