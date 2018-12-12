import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackIronRod10799 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int totalCount = 0;
		Stack<String> st = new Stack<String>();
		String input = br.readLine();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(') {
				
				st.push("(");
			} else {
				st.pop();
				if (input.charAt(i - 1) == '(') {
					totalCount += st.size();
				} else {
					totalCount++;
				}
			}
		}
		System.out.println(totalCount);
	}

}
