package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// 중첩 for 문을 이용해서 전체 구구단 출력
//		for(int i = 2 ; i <10 ; i++) {
//			for (int j = 1 ; j<10 ; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//		}
		for(int x = 0 ; x<=15 ; x++) {
		    for(int y = 0 ; y<=12 ; y++) {
		        if((4*x) + (5*y) == 60) {
		            System.out.println("x의 값" + x + "," + "y의 값" + y);
		        }
		    }
		}
		
		
		// 퀴즈> 4x + 5y =60 => x,y의 모든 경우의 수를 구하자
//		outerLabel:
//		for(int x =0 ; x<=60/4 ; x++) {
//			for(int y = 0 ; y <=60/5 ; y++) {
//				if((4*x) + (5*y) == 60) {
//					System.out.println(x + "," + y);
//					break outerLabel;
//				}
//			}
//		}
		
		// 퀴즈> 
		// *
		// **
		// ***
		// ****
		// *****
		
//		for(int i = 1 ; i<=5 ; i++) {
//			for(int j =1 ; j<=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 퀴즈 >
		// *****
		// ****
		// ***
		// **
		// *
		
//		System.out.println();
//		
//		for(int i=5 ; i>0 ; i--) {
//			for(int j =1 ; j<=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	
	}

}
