package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 20);
		Person p2 = new Person("ȫ�浿", 20);
		
		// ==�� �ּҰ��� ������ ��
		if(p1.equals(p2)) { // .equals�� �ϸ� Person���� equals �Լ��� ���� ������ �θ��� Object�� �ִ� equals�� ���(�ּ� ���� ����)
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		System.out.println(p1.toString()); // Object�� �ִ� toString ȣ��
	} 

}
