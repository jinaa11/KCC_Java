package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		// super 함수로 부모의 생성자 호출 => 부모 객체 생성 => 부모 클래스 메모리 할당 => 따라서 사용 가능
		// super 함수가 없으면 부모의 디폴트 생성자 호출
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {
		// Account 클래스 상속 받았기 때문에 getBalance()로 바로 사용 가능
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("결제 불가");
		} 
		
		return withdraw(amount);
	}
	
	public void print() {
		System.out.println("자식");
	}
}
