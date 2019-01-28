import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NumberTheory_Nextnum {

	/*
	예제 입력
	4 7 10
	2 6 18
	0 0 0
	예제 출력
	AP 13
	GP 54 
	 * */
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String[] inputs = sc.nextLine().split("\\s");
			int[] arr = new int[3];
			for (int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(inputs[i]);
			}
			if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
				break;
			if (arr[1] - arr[0] == arr[2] - arr[1]) {
				System.out.println("AP " + (2 * arr[2] - arr[1]));
			} 
			else
				System.out.println("GP " +  arr[2] * (arr[2] / arr[1]));
			
		}
	}
}
