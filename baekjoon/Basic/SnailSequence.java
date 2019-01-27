import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnailSequence {
	/* 
	예제 입력
	7 6
	11
	예제 출력
	6 6
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int r = sc.nextInt();
		int k = sc.nextInt();
		int go = 1;
		
		int x = 1, y = 0;
		List<String> list = new ArrayList<String>();
		while (c > 0 && r > 0 && k > 0) {
			
			for (int i = 0; i < r && k > 0; i++) {
				y += go;
				k--;
			}
			
			for (int i = 0; i < c  - 1 && k > 0; i++) {
				x += go;
				k--;
			}
			r--;
			c--;
			go *= -1;
		}
		if (k > 0)
			System.out.println(0);
		else 
			System.out.println(x + " " + y);

	}
}
