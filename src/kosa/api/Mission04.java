package kosa.api;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// a#b!GE*T@S
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		int arr[] = new int[100]; // 영어 알파벳 인덱스 배열
		int count = 0;
		char temp = ' ';
		
		for (int i = 0; i < ch.length; i++) {
			// 영어 알파벳 인덱스 위치 담기
			if ('a' <= ch[i] && 'z' >= ch[i] || 'A' <= ch[i] && 'Z' >= ch[i]) {
				arr[count++] = i;
			}
		}
		// 해당 인덱스에 있는 영어 알파벳 위치를 서로 바꾸기
		for (int i = 0; i < count / 2; i++) {
			temp = ch[arr[i]];
			ch[arr[i]] = ch[arr[count - 1 - i]];
			ch[arr[count - 1 - i]] = temp;
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
