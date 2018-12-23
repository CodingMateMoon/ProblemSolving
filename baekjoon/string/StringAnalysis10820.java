import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringAnalysis10820 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			int[] counts = new int[4];
			initCount(counts);
			StringBuffer sb = new StringBuffer();
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				if ('a' <= c && c <= 'z') {
					counts[0]++;
				} else if ('A' <= c && c <= 'Z') {
					counts[1]++;
				} else if ('0' <= c && c <= '9') {
					counts[2]++;
				} else if (c == ' ') {
					counts[3]++;
				}
			}

			for (int k = 0; k < counts.length; k++) {
				sb.append(counts[k] + " ");
			}
			System.out.println(sb);
		}
	}

	public static void initCount(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
	}

}
