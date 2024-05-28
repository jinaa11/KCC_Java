package kosa.oop;

public class Account {
	// 계좌 객체 생성하기 위해
	// 객체로부터 공통된 데이터 구조와 기능을 추출
	// 상태(데이터): 계좌 번호, 계좌주, 잔액 => 멤버변수(=필드) - 객체가 소멸할 때까지 존재
	// 행동(기능):입금하다, 출금하다 => 멤버 메서드
	String accountNo; // 계좌번호
	String ownerName; // 계좌주
	int balance; // 잔액
	
	// 생성자
	public Account() {} // 디폴트 생성자
	
	// 생성자의 매개변수는 생성자가 호출되고 나면 소멸
	public Account(String accountNo, String ownerName, int balance) {
		// this.accountNo: 멤버필드인 것을 명시
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public Account(String string, String string2, double d) {
		
	}

	// 입금하다
	// 객체 포함된 멤버메소드를 만들기에 static 붙이지 않음
	public void deposit(int amount) {
		balance += amount;
	}

	// 출금하다
	public int withdraw(int amount) throws Exception {
		if (balance < amount) {
			// 인위적인 예외 발생 시 호출하는 메소드를 예외 처리하도록 throws 해주어야 함
			// 예외 처리는 이 메소드를 호출하는 입장에서 처리함
			throw new Exception("잔액 부족");
		}
		balance -= amount;

		return amount;
	}

}
