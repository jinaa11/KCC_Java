package kosa.order;

public class Main {

	public static void main(String[] args) {
		Order o = new Order();
		
		while (true) {
			System.out.println("1.�ֹ� �߰� 2.���� 3.���� 4.�Ѹ��� �հ� 5.����");
			System.out.print("�޴�: ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			// �ֹ� �߰�
			case "1":
				o.addMenu();
				break;
			// ����
			case "2":

				break;
			// ����
			case "3":

				break;
			// �Ѹ��� �հ�
			case "4":

				break;
			case "5":
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
