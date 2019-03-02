import java.util.Scanner;

public class NumberTheory_fractionsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int downA, upA, downB, upB;
		upA = sc.nextInt();
		downA = sc.nextInt();
		upB = sc.nextInt();
		downB = sc.nextInt();
		
		int gcd = getGcd(downA, downB);
		int lcm = downA * downB / gcd;
		
//		downA *= lcm / downA;
		upA *= lcm / downA;
//		downB *= lcm / downB;
		upB *= lcm / downB;
		int newUp = upA + upB;
		int newGcd = getGcd(newUp, lcm);
		int resultUp = newUp / newGcd;
		lcm /= newGcd;
		System.out.println(resultUp + " " + lcm);
	}
	
	public static int getGcd(int a, int b) {
		return a % b == 0 ? b : getGcd(b, a % b);
	}
}
