package kosa.mission;

import java.util.Scanner;

public class Mission_galag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int hyun = 0; 
		int won = 0;
		int cnt = 1;
		
		for(int i = 1; i <= t; i++) {
			cnt = 1;
			hyun = sc.nextInt();
			won = sc.nextInt();
			
			for(int j = 0; j < 5000; j++) {
				hyun *= 2;
				won *= 3;
//				System.out.println("hyun: " + hyun + ", won: " + won);
				if(hyun < won) {
					break;
				}
				cnt++;
			}
			System.out.println("#" + i + " " + cnt);
		}

	}

}
