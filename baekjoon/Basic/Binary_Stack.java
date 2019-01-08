import java.util.Scanner;
import java.util.Stack;

public class Binary_Stack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getBinary(n));
	}
	
	public static String getBinary(int n) {
		if (n <= 1)
			return String.valueOf(n);
		Stack<Integer> s = new Stack<Integer>();
		while (n > 1) {
			int remainder = n % 2;
			n = n / 2;
			s.push(remainder);
		}
		StringBuilder sb = new StringBuilder();
		sb.append(n + "");
		while(!s.isEmpty()) {
			sb.append(s.pop() + "");
		}
		return sb.toString();
	}
	
}
