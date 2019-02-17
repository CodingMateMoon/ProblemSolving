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

	static int[][] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		BigInteger bigN = new BigInteger(String.valueOf(n));
		BigInteger bigM = new BigInteger(String.valueOf(m));
		BigInteger result = BigInteger.ONE;
		BigInteger div = BigInteger.ONE;
		for (int i = 0; i < m; i++) {
			result = result.multiply(new BigInteger(String.valueOf(n - i)));
			div = div.multiply(new BigInteger(String.valueOf(m - i)));
		}
		result = result.divide(div);
		int answer;
		if (n == 0 || n == 1 || m == 0) {
			answer = 0;
		} else {
//			answer = getZeroCount(result);
		}
//		System.out.println(answer);
//		System.out.println(result);
		System.out.println(getZeroCount(result.toString()));
	}
	
	public static int getPascal(int n, int m) {
		if (arr[n][m] != 0)
			return arr[n][m];
		if (n == 0 || n == 1 || m == 0 || n == m) {
			arr[n][m] = 1;
			return 1;
		} if (m == 1) {
			arr[n][m] = n;
			return arr[n][m];
		} 
		
		
		
		arr[n][m] = getPascal(n - 1, m - 1) + getPascal(n - 1, m);
		return arr[n][m];
	}
	
	public static int getZeroCount(String s) {
		int count = 0;
		int length = s.length();
		while(s.charAt(length - 1) == '0' && length > 0) {
			count++;
			length--;
		}
		return count;
	}
	
	/*public static int getZeroCount(BigInteger num) {
		int count = 0;
		while (num % 10 == 0) {
			count++;
			num = num / 10;
		}
		return count;
	}*/

	
}
