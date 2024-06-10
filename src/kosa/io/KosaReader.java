package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {

	public static void main(String[] args) {
		// ����(poem.txt)�� �ִ� ���ڿ� �����͸� �о����
		FileReader reader = null;
		char arr[] = new char[10];
		
		try {
			// FileReader ����
			reader = new FileReader("poem.txt");
			
			while(true) {
				Arrays.fill(arr, ' '); // �迭 �������� �ʱ�ȭ
				int data = reader.read(arr); // �迭�� �� ���� ���� �б�
				if(data == -1) break;
				System.out.println(arr);
			}
			
			reader.read(arr);
			System.out.println(arr);
//			while (true) {
//				int data = reader.read(); // �� �̻� �о���� ���ڰ� ������ -1 ��ȯ
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
