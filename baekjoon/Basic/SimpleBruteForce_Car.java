import java.util.Scanner;

public class SimpleBruteForce_Car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] caseX = {-1, 1, 0, 0};
		int[] caseY = {0, 0, -1, 1};
		char[][] arr = new char[5][5];
		for (int i = 0; i < 5; i++) {
			String[] inputs = sc.nextLine().split("\\s");
			for (int j = 0; j < inputs.length; j++) {
				arr[i][j] = inputs[j].charAt(0);
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int existCase = 0;
				int minCount = 0;
				for (int k = 0; k < 4; k++) {
					int cx = i + caseX[k];
					int cy = j + caseY[k];
					if (0 <= cx && cx < 5 && 0 <= cy && cy < 5) {
						existCase++;
						
						if (arr[cx][cy] > arr[i][j])
							minCount++;
					}
				}
				if (existCase == minCount)
					arr[i][j] = '*';
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
 	}

}
