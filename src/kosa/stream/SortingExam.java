package kosa.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 30));
		list.add(new Student("신용권", 10));
		list.add(new Student("유미선", 20));
		
		// 점수를 기준으로 오름차순으로 정렬한 새 스트림 얻기
		list.stream()
		.sorted()
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		System.out.println();
		
		// 점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
