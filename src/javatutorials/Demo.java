package javatutorials;

import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> mp = new HashMap<>();
		mp.put(2, 3);
		mp.put(3, 3);

		// Iterator<Map.Entry<Integer, Integer>> itr = mp.entrySet().iterator();

		/*
		 * while (itr.hasNext()) { Map.Entry<Integer, Integer> entry = itr.next();
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue()); }
		 */
//java 8 lambda with foreach
		mp.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

	}
}
