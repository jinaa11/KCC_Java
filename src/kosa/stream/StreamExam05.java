package kosa.stream;

import java.util.stream.IntStream;

public class StreamExam05 {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("����: " + sum);
	}

}
