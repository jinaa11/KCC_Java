package kosa.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {
		// 1. ����Ʈ��Ʈ���� �̿��Ͽ� �̹��� ������ �����غ���
//		String source = "C:\\work\\work_java\\image.jpg";
//		String dest = "C:\\upload\\image.jpg";
		
//		CopyUtil.copyFile(new File(source), new File(dest));
		
		// 2. ���丮 ���縦 ��������
		String source = "C:\\work\\work_java\\Kcc_Java\\src";
		String dest = "C:\\upload\\src";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
