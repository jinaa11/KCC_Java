package kosa.api;

import java.util.Scanner;

public class Mission03_1 {
	public static int solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
//			if(Character.isDigit(x)) { // ���ڸ� �������� �������� ����
//				answer += x;
//			}
			if(x >= 48 && x <= 57) {
				answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}

	

}
