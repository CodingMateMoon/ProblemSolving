import java.math.BigInteger;
import java.util.Scanner;

public class NumberTheory_CombinationZero {

	/*
	 문제
	n명의 사람중 m명을 순서에 상관없이 뽑는 경우의 수를 조합이라고 하며 nCm으로 나타낸다.
	nCm은 수식으로 n!/m!(n-m)! 으로 구할 수 있다. (5! = 12345)
	n과 m이 주어졌을때 nCm의 끝자리 0의 개수를 출력하는 프로그램을 작성하시오.  
	
	입력
	첫째 줄에 정수 n, m(0≤m≤n≤1,000,000)이 들어온다.
	
	출력
	첫째 줄에 0의 개수를 출력한다.
	 * */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		double result = 1;
		int up = 1;
		int down = 1;
		int upCountTwo = 0, upCountFive = 0, downCountTwo = 0, downCountFive = 0;
		
		/*for (int i = 0; i < m; i++) {
			result = result * (double) (n - i) / (m - i);
			if (result % 10 == 0) {
				cnt++;
				result /= 10;
			}
			System.out.print(result + " ");
		}
		System.out.println("cnt : " + cnt);*/
		for (int i = 0; i < m; i++) {
			int temp = n - i;
			while (temp % 2 == 0) {
				temp /= 2;
				upCountTwo++;
			}
			
			while (temp % 5 == 0) {
				temp /= 5;
				upCountFive++;
			}
			
			int downTemp = m - i;
			
			while (downTemp % 2 == 0) {
				downTemp /= 2;
				downCountTwo++;
			}
			
			while (downTemp % 5 == 0) {
				downTemp /= 5;
				downCountFive++;
			}
		}
//		System.out.println(upCountTwo + " : " + upCountFive + " : " + downCountTwo + " : " + downCountFive);
		int countTwo = upCountTwo - downCountTwo;
		int countFive = upCountFive - downCountFive;
		if (countTwo > 0 && countFive > 0) {
			System.out.println(Math.min(countTwo, countFive));
		} else {
			System.out.println(0);
		}
	}
	
}
