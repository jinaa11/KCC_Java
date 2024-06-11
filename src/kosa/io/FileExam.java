package kosa.io;

import java.io.File;

public class FileExam {
	// 재귀 함수
	public static void show(File file) {
		File list[] = file.listFiles();
		
		for(int i = 0; i < list.length; i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("** " + list[i].getName() + " **");
				show(list[i]);
			} else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}
	
	public static void main(String[] args) {
		String path = "C:\\work\\work_java\\Kcc_Java";
		
		File f = new File(path);
		show(f);
		
//		if(f.isDirectory()) {
//			System.out.println("디렉토리 입니다.");
//			System.out.println("** "+ f.getName() + " 폴더 입니다.");
//			
//			File arr[] = f.listFiles(); // 목록 조회
//			for(int i = 0; i < arr.length; i++) {
//				System.out.println(arr[i].getName());
//			}
//	
//		} else {
//			System.out.println("파일 입니다.");
//		}
	}	

}
