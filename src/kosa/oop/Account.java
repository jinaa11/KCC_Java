package kosa.oop;

public class Account {
	// ���� ��ü �����ϱ� ����
	// ��ü�κ��� ����� ������ ������ ����� ����
	// ����(������): ���� ��ȣ, ������, �ܾ� => �������(=�ʵ�) - ��ü�� �Ҹ��� ������ ����
	// �ൿ(���):�Ա��ϴ�, ����ϴ� => ��� �޼���
	String accountNo; // ���¹�ȣ
	String ownerName; // ������
	int balance; // �ܾ�
	
	// ������
	public Account() {} // ����Ʈ ������
	
	// �������� �Ű������� �����ڰ� ȣ��ǰ� ���� �Ҹ�
	public Account(String accountNo, String ownerName, int balance) {
		// this.accountNo: ����ʵ��� ���� ���
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account(String string, String string2, double d) {
		
	}

	// �Ա��ϴ�
	// ��ü ���Ե� ����޼ҵ带 ����⿡ static ������ ����
	public void deposit(int amount) {
		balance += amount;
	}

	// ����ϴ�
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			// �������� ���� �߻� �� ȣ���ϴ� �޼ҵ带 ���� ó���ϵ��� throws ���־�� ��
			// ���� ó���� �� �޼ҵ带 ȣ���ϴ� ���忡�� ó����
			throw new Exception("�ܾ� ����");
		}
		balance -= amount;

		return amount;
	}

}
