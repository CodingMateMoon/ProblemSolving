
import java.util.Scanner;



public class Recusive_Alphabet_permutation {

	static int n, r;

	static char result[] =  new char[105];

	static boolean check[] = new boolean[105]; // check[i] == true --> 알파벳 i가 이미 나왔음.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		getResult(0);
	}

	public static void getResult(int x) {
		if (x >= r) {

			System.out.println(result);
		} else {

			for (int i = 0; i < n; i++) {

				char alpha = (char) (i + 'a');
				if (check[i] == false) {
					result[x] = alpha;
					check[i] = true;
					getResult(x + 1);
					// x번째에 i를 넣는 모든 경우를 이미 다 고려했음
					/*
					 result[0] = 'a' 넣었을때 모든 경우 다 구함
					 check를 초기화하지않으면
					 result[0] = 'b'일때 result[1] = 'a' 넣을수 없게됨
					 * */
					check[i] = false;
					result[x] = 0;
				}
			}
		}
	}
}