import java.util.Scanner;

public class NumberTheory_pfactorization {

	/*
	 문제
	정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
	소인수란 소수인 인수(약수)를 의미한다.  
	입력
	첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
	출력
	N의 소인수를 한 줄에 하나씩 오름차순으로 출력한다.
	예제 입력
	72
	예제 출력
	2
	2
	2
	3
	3
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		
		for (int i = 2; num > 1;) {
			if (num % i == 0) {
				System.out.println(i);
				num /= i;
			} else {
				i++;
			}
		}
	}
}
