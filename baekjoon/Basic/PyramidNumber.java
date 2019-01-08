import java.util.Scanner;
import java.util.Stack;

public class PyramidNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		boolean flag = true;
		for (int i = 1; i <= 2 * n - 1; i = i + 2) {
			int mid = (2 * n - 1 - i) / 2;
			for (int j = 0; j < mid; j++) {
//				System.out.print(" ");
				sb.append(" ");
			}
			Stack<Integer> st = new Stack<Integer>();
			for (int k = 0; k < i; k++) {
//				System.out.print(s);
				if (flag) {
					
					st.push(s);
					s = (s + 1) % 10;
					if (s == 0)
						s++;
				} else {
					sb.append(s + "");
					s = (s + 1) % 10;
					if (s == 0)
						s++;
				}
			}
			if (flag) {
				while (!st.isEmpty()) {
					sb.append(st.pop() + "");
				}
			}
			for (int l = 0; l < mid; l++) {
				sb.append(" ");
			}
//			System.out.println();
			sb.append("\n");
			if (flag) {
				flag = false;
			} else {
				flag = true;
			}
		}
		System.out.println(sb);
		
	}

}
