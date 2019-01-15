import java.util.Scanner;

public class SimpleBruteForce_Rook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[8][8];
		for (int i = 0; i < 8; i++) {
			String[] inputs = sc.nextLine().split("\\s");
			for (int j = 0; j < 8; j++) {
				arr[i][j] = Integer.parseInt(inputs[j]);
			}
		}
//		int[] caseX = {-1, 1, 0, 0};
//		int[] caseY = {0, 0, -1, 1};
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == 1) {
					/*for (int k = j + 1; k < 8; k++) {
						if (arr[i][k] == 3) {
							break;
						} else if (arr[i][k] == 2) {
							flag = false;
						}
					}
					
					for (int k = j - 1; k >= 0; k--) {
						if (arr[i][k] == 3) {
							break;
						} else if (arr[i][k] == 2) {
							flag = false;
						}
					}
					for (int l = i + 1; l < 8; l++) {
						if (arr[i][l] == 3) {
							break;
						} else if (arr[i][l] == 2) {
							flag = false;
						}
					}
					
					for (int l = i - 1; l >= 0; l--) {
						if (arr[i][l] == 3) {
							break;
						} else if (arr[i][l] == 2) {
							flag = false;
						}
					}*/
					boolean flag = checkRook(arr, i, j);
					if (flag)
						System.out.println(0);
					else
						System.out.println(1);
					break;
				}
			}
		}
	}
	
	public static boolean checkRook(int[][] arr, int x, int y) {
		for (int k = x + 1; k < 8; k++) {
			if (arr[k][y] == 3) {
				break;
			} else if (arr[k][y] == 2) {
				return false;
			}
		}
		
		for (int k = x - 1; k >= 0; k--) {
			if (arr[k][y] == 3) {
				break;
			} else if (arr[k][y] == 2) {
				return false;
			}
		}
		for (int l = y + 1; l < 8; l++) {
			if (arr[x][l] == 3) {
				break;
			} else if (arr[x][l] == 2) {
				return false;
			}
		}
		
		for (int l = y - 1; l >= 0; l--) {
			if (arr[x][l] == 3) {
				break;
			} else if (arr[x][l] == 2) {
				return false;
			}
		}
		return true;
	}
	

}
