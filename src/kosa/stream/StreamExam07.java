package kosa.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExam07 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i am a best developer");
		
		list1.stream()
		.flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
		System.out.println();
	}

}
