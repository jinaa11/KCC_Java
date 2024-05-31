package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		// super �Լ��� �θ��� ������ ȣ�� => �θ� ��ü ���� => �θ� Ŭ���� �޸� �Ҵ� => ���� ��� ����
		// super �Լ��� ������ �θ��� ����Ʈ ������ ȣ��
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {
		// Account Ŭ���� ��� �޾ұ� ������ getBalance()�� �ٷ� ��� ����
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("���� �Ұ�");
		} 
		
		return withdraw(amount);
	}
	
	public void print() {
		System.out.println("�ڽ�");
	}
}
