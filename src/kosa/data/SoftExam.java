package kosa.data;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SoftExam {

	public static void main(String[] args) {
		// 정렬
		// 기본 정렬: Comparable => compareTo() 오버라이딩 -> sort 메소드만 호출
		// 정렬 기준 변경: Comparator => compare() 오버라이딩

		Random r = new Random();
		TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 내림차순 정렬
				if (o1 < o2) {
					return 1; // 자리를 바꾼다.
				} else if (o1 > o2) {
					return -1; // 자리를 그대로
				}
				return 0;
			}
		});

		for (int i = 0; set.size() < 6; i++) {
			set.add(r.nextInt(45) + 1);
		}

		System.out.println(set);
	}

}
