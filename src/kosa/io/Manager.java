package kosa.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.nio.file.Path;
import java.util.Scanner;

public class Manager {
	Scanner sc = new Scanner(System.in);

	public void printList(File source) {
		File list[] = source.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println("** " + list[i].getName() + " **");
			} else {
				System.out.println(" - " + list[i].getName());
			}
		}
	}

	public String moveSubDir(String source, String cmd) {
		String name = cmd.substring(3);
		return source + "\\" + name;
	}

	public String moveParentDir(File source) {
		return source.getParent();
	}
	
	public void makeDir(String source, String cmd) {
		String dirName = cmd.substring(6);
		System.out.println(dirName);
		File f = new File(source, dirName);
		f.mkdirs();
	}
	
	public void viDir(String source, String cmd) {
		String viName = cmd.substring(3);
		File viFile = null;
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			viFile = new File(source, viName);
			fw = new FileWriter(viFile);
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String str = br.readLine();
				if(str.equals("q")) {
					break;
				}
				fw.write(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {}
		}
	}
}
