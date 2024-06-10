package kosa.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam08 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", "남", 92));
		list.add(new Student("김수영", "여", 87));
		list.add(new Student("감자바", "남", 95));
		list.add(new Student("오해영", "여", 93));

		// 남학생만 묶어 List 생성
		List<Student> maleList = list.stream().filter(s -> s.getGender().equals("남")).collect(Collectors.toList());

		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();

		// 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		System.out.println();
	}

}
