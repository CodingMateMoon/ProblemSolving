import java.util.Scanner;

public class BoxColor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] inputs = sc.nextLine().split("\\s");
		int[] arr = new int[inputs.length];
		int[] caseX = {-1, 1};
		for (int i = 0; i < inputs.length; i++) {
			arr[i] = Integer.parseInt(inputs[i]);
		}
		System.out.println(checkSame(arr, caseX));
	}
	
	public static String checkSame(int[] arr, int[] caseX) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 2; j++) {
				int x = i + caseX[j];
				if (0 <= x && x < arr.length) {
					if (arr[x] == arr[i]) {
						return "NO";
					}
				}
			}
		}
		return "YES";
	}
}
