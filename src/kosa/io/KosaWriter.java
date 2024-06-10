package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWriter {

	public static void main(String[] args) {
		// Ű����κ��� ���ڿ��� �Է� �޾� ���Ͽ� ���� ������ ��������.
		// "q"�� �Է��ϱ� ������ ���ڿ��� ���Ͽ� ������ ����.
		// FileWriter: write(���ڿ�)
		// ���ϸ�: poem2.txt: �̸� ���� X
		// �ڵ� ���� �� �������� => ���� ���� Ȯ�� O
		// close() ����
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
//		String str = "";
//		String poem = "";

//		System.out.print("�Է�: ");
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
