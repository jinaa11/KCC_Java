 package kosa.thread;

public class SumMain {

	public static void main(String[] args) {
		// t1: 1~50 ���� ���ϴ� ������
		// t2: 51~100 ���� ���ϴ� ������
		// main: t1�� + t2�� => ��: 5050 => ����: join()
		SumThread t1 = new SumThread(1, 50);		
		SumThread t2 = new SumThread(51, 100);	
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("�հ�: " + (t1.getTotal() + t2.getTotal()));
		
		
		
	}

}
