package kosa.basic;

public class LoopExam01 {

	public static void main(String[] args) {
		// while : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ��������ó��
				// 1~10������ ��
//				int sum = 0;
//				int i=1;
//				while(i<=10) {
//					sum += i;
//					i++;
//				}
//				System.out.println("1~10������ �� : " +sum);
			
				// ����> ������ 7�� ���
				// 7*1 = 7
				// 7*2 = 14 ��������
				
//				int a = 1;
//				while(a<=9) {
//					System.out.println("7 * " + a + "=" + (7*a));
//					a++;
//				}
				
				
				// for�� : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : �������
//				int sum = 0;
//				for(int i=0; i<=10; i++) {
//					sum += i;
//				}
//				System.out.println("1~10������ �� : " +sum);
			
			
				// ����> 1���� 100���� 2�� ����� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�.
				
//				for(int i =1; i<=100 ; i++) {
//					if(i%2 !=0 && i%3 !=0) {
//						System.out.println(i);
//					}
//				}
				
				// continue�� ����Ͽ� 1���� 100���� 2�� ����� 3�� ����� �ƴ� ���� ���
//				for(int i =1 ;i <=100 ; i++) {
//					if(i%2 ==0 || i%3 ==0) {
//						continue;
//					}
//					System.out.println(i);
//				}
				
				// do~while : ��ɹ��� ��� ������ 1���� �����ؾ��� �� ���
				// Ű����κ��� ���ڸ� �Է� �ޱ�
				// ������ �Է��ϸ� ���� �Է� �޵��� �ϱ� ����
//				Scanner sc = new Scanner(System.in);
//				int n = 0;
//				
//				do {
//					System.out.print("�Է�: ");
//					n =sc.nextInt();
//				} while(n < 0);
//				
//				System.out.println("�Է� ��� :" + n);
			
				
				// 2���� ������ �Է� �޾� b -a ��� ��� ����
				// b > a �ǵ��� �Է� => a �� b���� ũ�� ���� �Է¹ޱ�!
				
//				Scanner sc = new Scanner(System.in);
//				int a = 0;
//				int b = 0;
//				do {
//					System.out.print("a �Է� :");
//					a= sc.nextInt();
//					System.out.print("b �Է� :");
//					b= sc.nextInt();
//				} while(a>b);
//				System.out.println("�Է°�� : " + (b-a));
				
				
				// ����3> ������ ���� 3���� �޾Ƽ� ���� ��ø���� �ʰ� ����ϱ�
				
//				int a,b,c;
//				
//				a= (int)(Math.random() * 9) +1;
//				
//				do {
//					b = (int)(Math.random() * 9) +1;
//				} while(a==b);
//				
//				do {
//					c= (int)(Math.random() * 9) +1;
//				} while(a==c || b==c);
//				
//				System.out.println(a+ "," + b + "," + c);

	}

}
