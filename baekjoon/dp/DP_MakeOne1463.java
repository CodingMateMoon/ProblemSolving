import java.util.Scanner;

public class DP_MakeOne1463 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] d = new int[num + 1];
		d[1] = 0;
		
		for (int i = 2; i <= num; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0) {
				d[i] = Math.min(d[i], d[i / 2] + 1);
 			}
			if (i % 3 == 0) {
				d[i] = Math.min(d[i], d[i / 3] + 1);
			}
		}
		System.out.println(d[num]);
	}

}
