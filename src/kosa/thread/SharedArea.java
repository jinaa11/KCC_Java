package kosa.thread;

public class SharedArea {
	Account account1;
	Account account2;
	
	// �ϰ� �� PrintThread�� run �޼��� ����
	// lock�� ���� ����
	synchronized void transfer(int amount) {
		try {
			account1.withdraw(1000000);
			System.out.println("�̸��� ����: 100���� ����");
			account2.deposit(1000000);
			System.out.println("������ ����: 100���� �Ա�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized int getTotal() {
		return account1.getBalance() + account2.getBalance();
	}
}
