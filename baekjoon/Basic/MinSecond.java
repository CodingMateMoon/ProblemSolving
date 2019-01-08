import java.util.Scanner;

public class MinSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int[] arr2 = new int[9];
		for (int i = 0; i < 9; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			arr2[i] = num;
		}
		
		for (int i = 0; i < 2; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
		System.out.println(arr[1]);
		for (int i = 0; i < arr2.length; i++) {
			if (arr[1] == arr2[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}

}
