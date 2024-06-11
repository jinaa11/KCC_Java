package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner => Ű����� ������ �Է�
		// System.in => InputStream - Ű���忡 ���� => InputStreamReader => BufferedReader(�� �پ� ����) - Ű���忡�� �Էµ� ��
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("�Է�: ");
			String str = "";
			
			while((str = br.readLine()) != null) { // �ܼ�â�� ctrl+z ������ �Է� �Ϸ�
				str += "\n";
				bw.write(str);
			}
			
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
			}
		}
	}

}
