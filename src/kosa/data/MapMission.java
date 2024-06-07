package kosa.data;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMission {

	public static void main(String[] args) {
		// 이름, 점수를 한 쌍으로 Map 자료구조로 구현하시오. ex) 김자바: 90, 박자바: 60
		// 1. 시험 응시자만 출력
		// 2. 총점, 평균, 최고 점수, 최저 점수 출력(Collections => max(), min())
		int sum = 0;
		int max = 0;
		int min = 0;
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("김자바", 90);
		map.put("이자바", 70);
		map.put("박자바", 20);
		map.put("최자바", 50);
		map.put("정자바", 85);
		
		// map => key 추출
		Set<String> set = map.keySet();
		System.out.println("응시자 명단: " + set);
		
		// map => value 추출
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
			
		while(iter.hasNext()) {
			sum += iter.next();			
		}
		System.out.println();

		max = Collections.max(values);
		min = Collections.min(values);
		
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + sum / map.size() + "점");
		System.out.println("최고 점수: " + max + "점");
		System.out.println("최저 점수: " + min + "점");
		
		
		
		
		
	}

}
