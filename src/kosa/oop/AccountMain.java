package kosa.oop;

public class AccountMain {
	// Ŭ������ ���� Ÿ��, ������ Ŭ���� Ÿ���� �� ������ Ÿ���� �� �� ����
	public static void main(String[] args) {
		Account account; // ������(Ŭ���� Ÿ��) - �ּ� ���� �������
//		account = new Account(accountNo, ownerName, balance); // ��ü ����(*�޸� �Ҵ�* �� ������ �������� �ּ� �� ����)
		account = new Account("111-111", "�̱浿", 100000);

		// ���� �����ϴ� API�� ���̵��� ����� ��. ���� �����ڸ� ���Ƿ� ������ �� ����.
		StringBuffer sb = new StringBuffer();		
// 		account.accountNo = "111-111";
//		account.ownerName = "ȫ�浿";
//		account.balance = 10000;
//
//		account.deposit(5000);
		
		// ���� �߻��ϱ� ������ ó�����־�� ��
		try {
			account.withdraw(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("���¹�ȣ: " + account.getAccountNo());
		System.out.println("������: " + account.getOwnerName());
		System.out.println("�ܾ�: " + account.getBalance());

	}

}