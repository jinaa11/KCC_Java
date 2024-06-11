package kosa.io;

import java.io.File;
import java.util.Scanner;


public class DosMission {

	public static void main(String[] args) {
		Manager m = new Manager();
		Scanner sc = new Scanner(System.in);
		String currentDir = "C:\\upload\\src";
		File newDir = null;
		
		while (true) {
			System.out.print("입력: ");
			String cmd = sc.nextLine();
			if (cmd.matches("^ls$")) {
				// cmd: ls
				if(newDir != null) {
					m.printList(newDir);
				} else {
					m.printList(new File(currentDir));
				}
				
			} else if (cmd.matches("^cd\\s+[a-zA-Z0-9]+$")) {
				String result = m.moveSubDir(currentDir, cmd);
				System.out.println(result);
				
				currentDir = result;
			} else if (cmd.matches("^cd\\s.{2}")) {
				// cmd: cd ..
				 String result = m.moveParentDir(new File(currentDir));
				 System.out.println(result);
				 currentDir = result;
			} else if (cmd.matches("^mkdir\\s+[a-zA-Z0-9]+$")) {
				// cmd: mkdir
				m.makeDir(currentDir, cmd);
			} else if(cmd.matches("^vi\\s+[a-zA-Z0-9]+\\.[a-zA-Z]+$")) {
				System.out.println("vi 출력");
				m.viDir(currentDir, cmd);
			}
		}
	}
}
