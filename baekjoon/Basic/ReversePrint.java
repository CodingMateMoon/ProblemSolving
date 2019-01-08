import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrint {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] inputs = br.readLine().split("\\s");
		
		for (int i = inputs.length - 1; i >= 0; i--) {
			int num = Integer.parseInt(inputs[i]);
			System.out.print(num + " ");
		}
	}

}
