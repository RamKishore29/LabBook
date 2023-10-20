package Lab7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMap {
	static List getValues(HashMap<Integer, Integer> hm) {
		List L1= new ArrayList<>();
		for(Map.Entry<Integer, Integer> ls: hm.entrySet()) {
			L1.add(ls.getValue());
		}
		Collections.sort(L1);
		return L1;
		
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm1= new HashMap<>();
		hm1.put(2, 34);
		hm1.put(3, 33);
		hm1.put(4, 29);
		hm1.put(5, 17);
		System.out.println(getValues(hm1));


	}

}
