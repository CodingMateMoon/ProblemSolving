import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Die {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int maxCount, maxIndex, total, totalMax = 0;
		HashMap<Integer, Integer> hm;
		for (int i = 0; i < n; i++) {
			hm = new HashMap<Integer, Integer>();
			String[] inputs = sc.nextLine().split("\\s");
			total = 0;
			maxIndex = 0;
			maxCount = 0;
			for (int j = 0; j < inputs.length; j++) {
				int compareNum = Integer.parseInt(inputs[j]);
				Integer val = hm.get(compareNum);
				if (val == null) {
					hm.put(compareNum, 1);
				} else {
					hm.put(compareNum, val + 1);
				}
			}
			for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
				if (e.getValue() > maxCount) {
					maxCount = e.getValue();
					maxIndex = e.getKey();
				}
			}

			int price;
			switch (maxCount) {
			case 1:
				Set<Integer> set = hm.keySet();
				Iterator<Integer> it = set.iterator();
				int maxKey = it.next();
				while (it.hasNext()) {
					int compareVal = it.next();
					if (compareVal > maxKey)
						maxKey = compareVal;
				}
				price = maxKey * 100;
				totalMax = Math.max(totalMax, price);
				break;
			case 2:
				price = 1000 + maxIndex * 100;
				totalMax = Math.max(totalMax, price);
				break;
			case 3:
				price = 10000 + maxIndex * 1000;
				totalMax = Math.max(totalMax, price);
				break;
			}
		}
		System.out.println(totalMax);
	}

}
