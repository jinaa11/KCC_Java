package kosa.api;

import java.util.Scanner;

public class Mission02_1 {

	public static String solution(String str) {
		String answer = "";
		String arr[] = str.split(" ");
		int max = 0;
		
		for(String x : arr) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(solution(str));
	}

	

}
