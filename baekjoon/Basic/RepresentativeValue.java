import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class RepresentativeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int total = 0;
		Map<Integer, Integer> map = new TreeMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
			Integer val = map.get(arr[i]);
			if (val == null) {
				map.put(arr[i], 1);
			} else {
				map.put(arr[i], val + 1);
			}
		}
		
		int[] arrCount = new int[10];
		System.out.println(total / 10);
		int maxVal = 0, maxCount = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (maxCount < entry.getValue()) {
				maxCount = entry.getValue();
				maxVal = entry.getKey();
			} 
		}
		System.out.println(maxVal);
	}
}
