package ListPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertHashMappToList {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		HashMap<String,Integer> map1 = new HashMap<>();
		map1.put("Gray", 1);
		map.put("Black", 164);
		map.put("Blue", 16);
		map.put("Green", 64);
		map.put("Red", 34);
		map.put("White", 47);
		map.put("Orange", 123);
		map.put("Yellow", 76);
		map.put("Pink", 7898);
		
		System.out.println(map);
		System.out.println(map1);
		//System.out.println(map.get("Pink"));
		map1.putAll(map);
		//System.out.println(map);
		System.out.println(map1);
		List<String> keys = new ArrayList<>(map1.keySet());
		List<Integer> values = new ArrayList<>(map1.values());
		List<Map.Entry<String, Integer>> keysvalues= new ArrayList<>(map1.entrySet());

		System.out.println(keys);
		System.out.println(values);
		System.out.println(keysvalues);
		System.out.println(keysvalues.get(3));
		System.out.println(keysvalues.get(0));
		
	}

}
