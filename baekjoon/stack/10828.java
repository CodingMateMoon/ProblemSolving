import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackBasic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			String[] inputs = br.readLine().split("\\s");
			String arg0 = inputs[0];
			if (arg0.equals("push")) {
				st.push(Integer.parseInt(inputs[1]));
			} else if (arg0.equals("top")) {
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.peek());
				}
			} else if (arg0.equals("size")) {
				System.out.println(st.size());
			} else if (arg0.equals("empty")) {
				if (st.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}
			} else if (arg0.equals("pop")) {
				if (st.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(st.pop());
				}
			}
			
		}
		
	}

}
