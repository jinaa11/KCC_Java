package kosa.company;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("A123", "ȫ�浿", 25, "����� ���α�");
		Member m2 = new Member("B123", "��浿", 30, "����� ���ı�");
		
		Team t1 = new Team("1", "�λ���");
		Team t2 = new Team("2", "������");
		Team t3 = new Team("3", "��������");
		
		Role r1 = new Role("1", "���");
		Role r2 = new Role("2", "�븮");
		Role r3 = new Role("3", "����");
		Role r4 = new Role("4", "����");
		
		t1.addRole(r2);
		t1.addRole(r1);
		t2.addRole(r1);
		
		r2.addMember(m2);
		r2.addMember(m1);
		r1.addMember(m1);
		
		t1.print();
		t2.print();
		
	}

}
