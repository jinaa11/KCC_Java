package kosa.io;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExam {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("write.txt");
			
			while(true) {
				int data = is.read();
				if(data == -1) {
					break;
				}
				System.out.println(data);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
