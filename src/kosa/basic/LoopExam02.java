package kosa.basic;

public class LoopExam02 {

	public static void main(String[] args) {
		// ��ø for ���� �̿��ؼ� ��ü ������ ���
//		for(int i = 2 ; i <10 ; i++) {
//			for (int j = 1 ; j<10 ; j++) {
//				System.out.println(i + "*" + j + "=" + (i*j));
//			}
//		}
		for(int x = 0 ; x<=15 ; x++) {
		    for(int y = 0 ; y<=12 ; y++) {
		        if((4*x) + (5*y) == 60) {
		            System.out.println("x�� ��" + x + "," + "y�� ��" + y);
		        }
		    }
		}
		
		
		// ����> 4x + 5y =60 => x,y�� ��� ����� ���� ������
//		outerLabel:
//		for(int x =0 ; x<=60/4 ; x++) {
//			for(int y = 0 ; y <=60/5 ; y++) {
//				if((4*x) + (5*y) == 60) {
//					System.out.println(x + "," + y);
//					break outerLabel;
//				}
//			}
//		}
		
		// ����> 
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
		
		// ���� >
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
