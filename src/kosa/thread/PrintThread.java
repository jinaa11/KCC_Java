package kosa.thread;

public class PrintThread extends Thread {
	SharedArea sharedArea;
	
	public PrintThread() {}

	public PrintThread(SharedArea sharedArea) {
		super();
		this.sharedArea = sharedArea;
	}

	@Override
	public void run() {
		for(int cnt = 0; cnt < 3; cnt++) {
			int sum = sharedArea.getTotal();
			System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
//			synchronized (sharedArea) {
//				int sum = sharedArea.account1.getBalance() +
//						sharedArea.account2.getBalance();
//				System.out.println("°èÁÂ ÀÜ¾× ÇÕ°è: " + sum);
//			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	
}
