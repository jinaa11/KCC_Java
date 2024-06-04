package kosa.api;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = "";
		int num = 0;
		// g0en2T0s8eSoft
		for (int i = 0; i < str.length(); i++) {
//			str.charAt(i)
			char c = str.charAt(i);
			if ('a' <= c && 'z' >= c || 'A' <= c && 'Z' >= c) {
				continue;
			} else {
				str2 = c + "";
//				num = Integer.parseInt(str2);
			}
			num = Integer.parseInt(str2);
			System.out.print(num);
		}

	}

}
