package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyUtil {

	// 디렉토리 복사(해당 폴더 복사해서 새로운 디렉토리 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdirs();

			File fileList[] = source.listFiles();
			
			for (int i = 0; i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if (sourceFile.isDirectory()) {
					// new File(디렉토리 경로, 파일 이름);
					File s_destFile = new File(dest, sourceFile.getName());
					copyDirectory(sourceFile, s_destFile);
				} else {
					// dest를 디렉토리에서 파일로 만들기
					// new File(디렉토리 경로, 파일 이름);
					File destFile = new File(dest, sourceFile.getName());
					copyFile(sourceFile, destFile);
				}
			}
		}
	}

	// 바이트 값을 가진 파일 1개를 복사하는 메서드
	// source: 원본 파일, dest: 복사된 파일
	public static void copyFile(File source, File dest) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		byte arr[] = new byte[1024];
		int data = 0;

		try {
			fis = new FileInputStream(source);
			fos = new FileOutputStream(dest);

			while ((data = fis.read(arr)) != -1) {
				fos.write(arr, 0, data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
			}
		}
	}
}
