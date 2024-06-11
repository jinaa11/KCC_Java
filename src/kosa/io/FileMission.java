package kosa.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		// 1. 바이트스트림을 이용하여 이미지 파일을 복사해보자
//		String source = "C:\\work\\work_java\\image.jpg";
//		String dest = "C:\\upload\\image.jpg";
		
//		CopyUtil.copyFile(new File(source), new File(dest));
		
		// 2. 디렉토리 복사를 구현하자
		String source = "C:\\work\\work_java\\Kcc_Java\\src";
		String dest = "C:\\upload\\src";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
