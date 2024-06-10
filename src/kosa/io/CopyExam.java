package kosa.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class CopyExam {
	public static void main(String[] args) {
		// poem2.txt => poem3.txt: 복사를 구현해 보자
		FileWriter writer = null;
		FileReader reader = null;
		char[] arr = new char[100];

		try {
			reader = new FileReader("poem2.txt");
			writer = new FileWriter("poem3.txt");

			while (true) {
//				int data = reader.read();
				Arrays.fill(arr, ' ');
				// 실제 데이터 값은 arr에 있고 data는 다 읽어 왔는지 체크 용도
				int data = reader.read(arr); 
				if (data == -1) {
					break;
				}
				writer.write(arr);
			}
			System.out.println("복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
