package kosa.api;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		int count = 0;

		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[ch.length - 1 - i]) {
				System.out.println(ch[i] + ", " + ch[ch.length - 1 - i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
