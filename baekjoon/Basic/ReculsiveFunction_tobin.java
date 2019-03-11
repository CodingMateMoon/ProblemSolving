import java.util.Scanner;

public class ReculsiveFunction_tobin {

	static int n, k;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		tobin(1, 1, "1");
		tobin(1, 0, "0");
	}

	public static void tobin(int digits, int oneCount, String result) {
		if (digits == n) {
			if (oneCount == k) {
				System.out.println(result);
				return;
			} else {
				return;
			}
		} else {
			if (oneCount == k) {
				for (int i = 0; i < n - digits; i++) {
					result += 0;
				}
				System.out.println(result);
				return;
			} else {
				tobin(digits + 1, oneCount + 1, result + 1);
				tobin(digits + 1, oneCount, result + 0);
			}
		}
	}
	
	
}
