import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(0, 1);
		hm.put(1, 3);
		hm.put(2, 5);
		
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
		System.out.println(hm.get(3) == null);
		
		Set<Integer> set = hm.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int key = it.next();
			System.out.println("[Iterator] " + key + " : " + hm.get(key));
		}
		
	}

}
