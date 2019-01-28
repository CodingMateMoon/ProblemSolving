import java.util.Scanner;

public class NumberTheory_Prosjeck {

	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] input = sc.nextLine().split("\\s");
		int[] arr = new int[n];
		int[] targetArr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int val = 0;
			for (int j = 0; j < i; j++) {
				val += targetArr[j];
			}
			targetArr[i] = arr[i] * (i + 1) - val;
			sb.append(targetArr[i] + " ");
		}
		System.out.println(sb);
	}
}
