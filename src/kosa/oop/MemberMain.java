package kosa.oop;

public class MemberMain {

	public static void main(String[] args) {
		Member m1 = new Member(); // ��ü ���� => �ν��Ͻ�ȭ: m1 => �ν��Ͻ� ����
		m1.name = "������"; // ��ü �ʱ�ȭ
		m1.age = 20;
		m1.address = "����� ���α�";
		m1.phone = "010-1234-5678";
		
		System.out.println();
		
//		Member m2 = new Member();
//		m2.name = "ȫ�浿";
//		m2.age = 30;
//		m2.address = "�λ�� �ؿ�뱸";
//		m2.phone = "010-5555-2222";
		Member m2 = new Member("ȫ�浿", 30, "�λ�� �ؿ�뱸", "010-5555-2525");
		
		m1.printMember();
		System.out.println();
		m2.printMember();
		System.out.println();
		
		Member m3 = new Member("ȫ���", 25);
		m3.address = "����� ���ı�";
		m3.phone = "010-7777-1118";
		
		m3.printMember();
		System.out.println();
		
		Member m4;
		m4 = new Member("����", 20, "�λ�� �λ�����", "010-7111-8888");
		
		m4.printMember();
	}

}
