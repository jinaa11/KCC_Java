package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		// ����(����)���� Ư¡ 2����
				// 1. �ݵ�� �ʱ�ȭ �� ����ؾ� �Ѵ�.
				// 2. ����� ������ ���ǵ� ���� �ȿ����� ��� �����ϴ�.

				// ������ �ʱ�ȭ �ؾ� �Ѵٴ� ���� ����
//				int num;

//				num = num + 1;
//				System.out.println(num);

				int num = 0;

				num = num + 1;
				System.out.println(num);

				// a ��� ������ if ���� �ȿ����� ����� �� �ִ�.
//				if(num==1) {
//					int a = 100;
//				}
//				System.out.println("a :" + a);

				// ������ �̸� �ʱ�ȭ��Ų�ٸ� if �� �ۿ����� ����� �� �ִ�.
				int a = 0;
				if (num == 1) {
					a = 100;
				}
				System.out.println("a :" + a);

				int i = 1;
				for (; i <= 10; i++) {
					System.out.print(i + ",");
				}

				System.out.println();
				System.out.println("���� i�� : " + i);

				// ���� ���� ���?
				// 1. � ������ ������ ? => ������ Ÿ�� ���� ����
				// 2. �����͸� ������ ����ϴ���? => ������ �������� �˾ƾ��� => ���� ���� ��ġ�� �޶����Ƿ� ������ �ʿ䰡 ����

				
				// ������ %
				
				System.out.println(10%3);
				
				// ���ǽĿ��� ������� �ʱ� ������ �����ڵ尡 �߻��Ѵ�.
				if(11%2 == 0) {
					System.out.println("2�� ����̴�.");
				} else {
					System.out.println("2�� ����� �ƴϴ�.");
				}
				
				// ���տ����� & ������
				int num2 = 1;
				num2 = num2 +1 ;
				num2 += 1;
				num2++;
				
				System.out.println(num2);
				
				int x = 10;
				int y = 0;
				
				
				// ��ġ�����ڿ� ��ġ�������� ����
				// ��ġ �����ڴ� ���� ����� �� ������ �ǹǷ� ������� ������ +1�� �� ���·� ���;������� ����� ���´� ���� �״���� ���·� ����
				// ��ġ �����ڴ� ������ �� ���Ŀ� ����� �ǹǷ� ���� ������ +1�� ���·� ��µȴ�.
				y = x++;
//				y = ++x;
				
				System.out.println("ù���� y :" + y);
				System.out.println("�ι�° y :" + y++);
				System.out.println("������ y :" + y);
				System.out.println("�׹�° y :" + ++y);
				System.out.println();
				System.out.println("ù��° x :" + x);
				System.out.println("�ι��� x :" + x++);
				System.out.println("����° x :" + ++x);
				
				System.out.println("������ x :" + x);
				
				
				
				
				// ���׿����� (���ǿ�����)
				
				int b = 40;
				int c = 20;

				int max = (b>c) ? b : c;
				
				System.out.println(max);

	}

}
