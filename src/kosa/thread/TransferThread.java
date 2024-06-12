package kosa.thread;

public class TransferThread extends Thread {
	SharedArea sharedArea;

	public TransferThread() {
	}

	public TransferThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for (int cnt = 0; cnt < 12; cnt++) {
			sharedArea.transfer(100);
			
//			try {
//				// 완결 후 PrintThread의 run 메서드 실행
//				// lock과 같은 역할
//				synchronized (sharedArea) {
//					sharedArea.account1.withdraw(1000000);
//					System.out.println("이몽룡 계좌: 100만원 인출");
//					sharedArea.account2.deposit(1000000);
//					System.out.println("성춘향 계좌: 100만원 입금");
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			}

		}
	}

	public SharedArea getSharedArea() {
		return sharedArea;
	}

	public void setSharedArea(SharedArea sharedArea) {
		this.sharedArea = sharedArea;
	}

}
