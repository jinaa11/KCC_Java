package kosa.order;

public class Order extends MenuItem {
	MenuItem mi[];
	
	int count;

	public Order() {
		mi = new MenuItem[] {
	            new Appetizer("��", 3000, "������", true),
	            new Appetizer("����", 5000, "����� ����", false),
	            new Appetizer("���� ������", 7000, "�ż��� ���� ������", false),
	            new MainCourse("�Ƚ� ������ũ", 15000, "�Ƚ�", "����"),
	            new MainCourse("�ɵ�� ������ũ", 20000, "�ɵ��", "�̵��"),
	            new MainCourse("Ƽ�� ������ũ", 18000, "Ƽ��", "����"),
	            new Dessert("����Ÿ��Ʈ", 7000, "����Ÿ��Ʈ", 135),
	            new Dessert("���Ʈ", 6000, "����Ÿ��Ʈ", 60),
	            new Dessert("��������ũ", 8000, "����Ÿ��Ʈ", 370)
	        };	
	}
	
	public void addMenu() {
		System.out.println("1)����Ÿ���� 2)�����ڽ� 3)����Ʈ");
		System.out.print("�޴� ����: ");
		String menu = DataInput.sc.nextLine();
		System.out.println(mi.length);

		switch (menu) {
		case "1":
			System.out.println("1)����Ÿ����");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof Appetizer) {
					mi[i].show();
				}
			}
			break;
		case "2":
			System.out.println("2)�����ڽ�");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof MainCourse) {
					mi[i].show();
				}
			}
			System.out.print("���� ����: ");
			String baked = DataInput.sc.nextLine();
			
			
			break;
		case "3":
			System.out.println("3)����Ʈ");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof Dessert) {
					mi[i].show();
				}
			}
			break;
		}
	}
}
