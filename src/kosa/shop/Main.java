package kosa.shop;

public class Main {

	public static void main(String[] args) {
		ShoppingMall sm = new ShoppingMall();
		while (true) {
			System.out.println("1.�� ��� 2.��ǰ ��� 3.��ǰ ī�װ��� ��� ���� 4.��ǰ �ֹ��ϱ� 5.���� �ֹ� ��Ϻ��� 6.�����ϱ�");
			System.out.print("�޴�: ");
			String menu = DataInput.sc.nextLine();

			switch (menu) {
			case "1":
				sm.addCustomer();
				break;
			case "2":
				sm.addProduct();
				break;
			case "3":
				sm.listCategory();
				break;
			case "4":
				sm.orderProduct();
				break;
			case "5":

				break;
			case "6":
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

}
