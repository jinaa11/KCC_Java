package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// �̸�, ������ �� ������ Map �ڷᱸ���� �����Ͻÿ�. ex) ���ڹ�: 90, ���ڹ�: 60
		// 1. ���� �����ڸ� ���
		// 2. ����, ���, �ְ� ����, ���� ���� ���(Collections => max(), min())
		int sum = 0;
		int max = 0;
		int min = 0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 70);
		map.put("���ڹ�", 20);
		map.put("���ڹ�", 50);
		map.put("���ڹ�", 85);
		
		// map => key ����
		Set<String> set = map.keySet();
		System.out.println("������ ���: " + set);
		
		// map => value ����
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
			
		while(iter.hasNext()) {
			sum += iter.next();			
		}
		System.out.println();

		max = Collections.max(values);
		min = Collections.min(values);
		
		System.out.println("����: " + sum + "��");
		System.out.println("���: " + sum / map.size() + "��");
		System.out.println("�ְ� ����: " + max + "��");
		System.out.println("���� ����: " + min + "��");
		
		
		
		
		
	}

}
