package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyUtil {

	// ���丮 ����(�ش� ���� �����ؼ� ���ο� ���丮 ���� �� ��� ������ ����)
	public static void copyDirectory(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdirs();

			File fileList[] = source.listFiles();
			
			for (int i = 0; i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if (sourceFile.isDirectory()) {
					// new File(���丮 ���, ���� �̸�);
					File s_destFile = new File(dest, sourceFile.getName());
					copyDirectory(sourceFile, s_destFile);
				} else {
					// dest�� ���丮���� ���Ϸ� �����
					// new File(���丮 ���, ���� �̸�);
					File destFile = new File(dest, sourceFile.getName());
					copyFile(sourceFile, destFile);
				}
			}
		}
	}

	// ����Ʈ ���� ���� ���� 1���� �����ϴ� �޼���
	// source: ���� ����, dest: ����� ����
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
