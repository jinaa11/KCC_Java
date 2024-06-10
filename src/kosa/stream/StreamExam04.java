package kosa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam04 {

	public static void main(String[] args) {
//		List<Integer> list = IntStream.rangeClosed(1, 10)
//				.boxed()
//				.collect(Collectors.toList());
//		
//		list.stream().forEach(System.out::println);
//		
//		IntStream.of(2,4,5,6,8,10).boxed().collect(Collectors.toList());
		
		// 문자열 배열 => List, Stream 변환
		String arr[] = {"BB", "CC", "AA"};
//		List<String> list = Arrays.asList(arr);
//		
//		Stream<String> stream = list.stream();
//		stream.sorted().forEach(System.out::println);
		
		Stream<String> stream = Arrays.stream(arr);
		stream.sorted().forEach(System.out::println );
	}

}
