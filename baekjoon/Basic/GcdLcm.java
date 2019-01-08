import java.util.Scanner;

public class GcdLcm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = getGcd(a, b);
		System.out.println(gcd);
		System.out.println(a * b / gcd);
	}
	
	public static int getGcd(int a, int b) {
		if (b == 0)
			return a;
		return getGcd(b, a % b);
	}
	
	public static void gcdLcm(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		int gcd = 0, lcm = 0;
		for (int i = b; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
				break;
			}
		}
		System.out.println(gcd);
		System.out.println(a * b / gcd);
	}
	
}
