package kosa.oop;

public class AccountMain {
	// 클래스도 참조 타입, 각각의 클래스 타입이 다 데이터 타입이 될 수 있음
	public static void main(String[] args) {
		Account account; // 참조형(클래스 타입) - 주소 값이 들어있음
//		account = new Account(accountNo, ownerName, balance); // 객체 생성(*메모리 할당* 및 참조형 변수에게 주소 값 전달)
		account = new Account("111-111", "이길동", 100000);

		// 원래 존재하는 API는 가이드대로 따라야 함. 내가 생성자를 임의로 정의할 수 없다.
		StringBuffer sb = new StringBuffer();		
// 		account.accountNo = "111-111";
//		account.ownerName = "홍길동";
//		account.balance = 10000;
//
//		account.deposit(5000);
		
		// 예외 발생하기 때문에 처리해주어야 함
		try {
			account.withdraw(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("계좌번호: " + account.getAccountNo());
		System.out.println("계좌주: " + account.getOwnerName());
		System.out.println("잔액: " + account.getBalance());

	}

}