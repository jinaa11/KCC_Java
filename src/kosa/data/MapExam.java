package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		// Map(�������̽�): (key, value), (key, value)... => HashMap
		Map<String, String> map = new HashMap<String, String>();

		map.put("1", "KIA");
		map.put("2", "LG");
		map.put("3", "Samsung");

		System.out.println("����� ������: " + map.size());

		if (map.containsValue("LG")) {
			map.remove("2");
		}
		System.out.println("����� ������: " + map.size());
		System.out.println("�Ｚ��: " + map.get("3"));

		// Map ��ü ��� ���(key, value): key ����
		// Map => Set���� ĳ���� => Iterator
		// key => keySet(): Set
		// value => values(): Collection(�������̽�)
		// (key, value) => entrySet(): Set
		Set set = map.entrySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> e = (Map.Entry<String, String>) iter.next();
			System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
		}
	}
}
