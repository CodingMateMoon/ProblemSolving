import java.util.Scanner;

public class NumberTheory_Fibonacci {

	/* 
	예제 입력
	10
	예제 출력
	55
	 * */
	
	static int[] arr = new int[46];
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}
	
	public static int fibo(int n) {
		if (n <= 1)
			return n;
		if (arr[n] > 0)
			return arr[n];
		arr[n] = fibo(n - 2) + fibo(n - 1);
		return arr[n];
	}
}
