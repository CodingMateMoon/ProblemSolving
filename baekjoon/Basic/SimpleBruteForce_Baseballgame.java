import java.util.Scanner;

public class SimpleBruteForce_Baseballgame {

	/*
	예제 입력
	4
	123 1 1
	356 1 0
	327 2 0
	489 0 1
	예제 출력
	2
	 * */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] arr = new int [n][3];
		int count = 0;
		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split("\\s");
			for (int j = 0; j < 3; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for (int i = 123; i <= 987; i++) {
			if(checkDiffer(i)) {
				if(checkAnswer(i, arr, n))
					count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean checkAnswer(int num, int[][] arr, int n) {
			for (int j = 0; j < n; j++) {
				
				if(!compareNumber(num, arr[j][0], arr[j][1], arr[j][2]))
					return false;
			}
			return true;
	}
	
	public static boolean checkDiffer(int num) {
		int[] values = new int[3];
		for (int i = 0; i < 3; i++) {
			values[i] = num % 10;
			if (values[i] == 0)
				return false;
			num /= 10;
		}
		if (values[0] == values[1] || values[1] == values[2] || values[0] == values[2])
			return false;
		else
			return true;
	}

	
	public static boolean compareNumber(int num, int comparedNum, int strike, int ball) {
		int[] numValues = new int[3];
		int[] comparedNumValues = new int[3];
		int cStrike = 0, cBall = 0;
		for (int i = 0; i < 3; i++) {
			numValues[i] = num % 10;
			comparedNumValues[i] = comparedNum % 10;
			num /= 10;
			comparedNum /= 10;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					if (numValues[i] == comparedNumValues[j])
						cStrike++;
				} else {
					if (numValues[i] == comparedNumValues[j])
						cBall++;
				}
			}
		}
		if (cStrike == strike && cBall == ball)
			return true;
		else
			return false;
	}
}
