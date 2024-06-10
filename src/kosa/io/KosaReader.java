package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {

	public static void main(String[] args) {
		// 파일(poem.txt)에 있는 문자열 데이터를 읽어오기
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			// FileReader 생성
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr, ' '); // 배열 공백으로 초기화
				int data = reader.read(arr); // 배열로 한 번에 파일 읽기
				if(data == -1) break;
				System.out.println(arr);
			}
			
			reader.read(arr);
			System.out.println(arr);
//			while (true) {
//				int data = reader.read(); // 더 이상 읽어들일 문자가 없으면 -1 반환
//				if (data == -1)
//					break;
//				System.out.print((char) data);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e2) {}
		}
	}

}
