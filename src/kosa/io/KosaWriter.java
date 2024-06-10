package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWriter {

	public static void main(String[] args) {
		// 키보드로부터 문자열을 입력 받아 파일에 쓰는 예제를 구현하자.
		// "q"를 입력하기 전까지 문자열을 파일에 쓰도록 하자.
		// FileWriter: write(문자열)
		// 파일명: poem2.txt: 미리 생성 X
		// 코드 실행 후 리프레쉬 => 파일 생성 확인 O
		// close() 구현
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
//		String str = "";
//		String poem = "";

//		System.out.print("입력: ");
//		while (!(str = sc.nextLine()).equals("q")) {
//			poem += str;
//			poem += "\n";
//		}
//
//		try {
//			writer = new FileWriter("poem2.txt");
//			writer.write(poem);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				writer.close();
//			} catch (Exception e2) {
//			}
//		}

		try {
			writer = new FileWriter("poem2.txt");
			while (true) {
				String str = sc.nextLine();
				if (str.equals("q")) {
					break;
				}
				writer.write(str + "\n");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
