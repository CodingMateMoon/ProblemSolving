import java.util.Scanner;

public class NumberTheory_Beehive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getMaxInLevel(n));
	}
	
	public static int getMaxInLevel(int num) {
		if (num == 1)
			return 1;
		int sum = 1;
		int level = 1;
		while (sum < num) {
			sum += 6 * level;
			level++;
		}
		return level;
	}
}
