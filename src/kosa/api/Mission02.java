package kosa.api;

import java.util.Scanner;

public class Mission02 {

	public static void main(String[] args) {
		// it is time to study
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String answer = "";
		int max = 0;
		int len = 0;
		
		String str2[] = str.split(" ");
		for(int i = 0; i < str2.length; i++) {
			len = str2[i].length();
			if(max < len) {
				max = len;
				answer = str2[i];
			}
		}
		System.out.println(answer);
	}
}