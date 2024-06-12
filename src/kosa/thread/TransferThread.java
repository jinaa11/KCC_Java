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
//				// �ϰ� �� PrintThread�� run �޼��� ����
//				// lock�� ���� ����
//				synchronized (sharedArea) {
//					sharedArea.account1.withdraw(1000000);
//					System.out.println("�̸��� ����: 100���� ����");
//					sharedArea.account2.deposit(1000000);
//					System.out.println("������ ����: 100���� �Ա�");
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
