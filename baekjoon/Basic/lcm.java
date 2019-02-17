import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if (a < b) {
			long temp = a;
			a = b;
			b = temp;
		}
		long gcm = gcm(a, b);
		System.out.println(a * b / gcm);
	}
	
	public static long gcm(long a, long b) {
		return a % b == 0 ? b : gcm(b, a % b);
	}
}
