package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map(인터페이스): (key, value), (key, value)... => HashMap
		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");

		System.out.println("요소의 사이즈: " + map.size());

		if (map.containsValue("LG")) {
			map.remove("2");
		}
		System.out.println("요소의 사이즈: " + map.size());
		System.out.println("삼성팀: " + map.get("3"));

		// Map 전체 목록 출력(key, value): key 없이
		// Map => Set으로 캐스팅 => Iterator
		// key => keySet(): Set
		// value => values(): Collection(인터페이스)
		// (key, value) => entrySet(): Set
		Set set = map.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>) iter.next();
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
	}
}
