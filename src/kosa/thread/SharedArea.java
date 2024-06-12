package kosa.thread;

public class SharedArea {
	Account account1;
	Account account2;
	
	// 완결 후 PrintThread의 run 메서드 실행
	// lock과 같은 역할
	synchronized void transfer(int amount) {
		try {
			account1.withdraw(1000000);
			System.out.println("이몽룡 계좌: 100만원 인출");
			account2.deposit(1000000);
			System.out.println("성춘향 계좌: 100만원 입금");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized int getTotal() {
		return account1.getBalance() + account2.getBalance();
	}
}
