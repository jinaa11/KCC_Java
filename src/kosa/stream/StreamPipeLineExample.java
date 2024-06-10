package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30));

//		Stream<Student> studentStream = list.stream();
//		// 중간 처리(학생 객체를 점수로 매핑)
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		// 최종 처리(평균 점수)
//		double avg = scoreStream.average().getAsDouble();
//		
//		list.stream().mapToInt(s -> s.getScore()) // 중간 필터 스트림
//				.forEach(score -> System.out.println(score));

//		list.stream().map(Student::getName)
//					.forEach(name -> System.out.println(name));

		// 홍으로 시작하는 이름만 추출
		list.stream().filter(s -> s.getName().startsWith("홍"))
					.forEach(s -> System.out.println(s.getName()));

		double avg = list.stream().mapToInt(student -> student.getScore()) // int형 스트림 생성(정수 값이 여러개 들어있음)
				.average().getAsDouble();

		System.out.println("평균 점수: " + avg);

	}

}
