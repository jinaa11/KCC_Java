package kosa.thread;

public class JoinExam {

	public static void main(String[] args) {
		SumThread_1 t1 = new SumThread_1(1, 50);
		SumThread_1 t2 = new SumThread_1(51, 100);
		
		t1.start();
		t2.start();
			
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {

		}
		
		System.out.println("гу╟Х: " + (t1.getTotal()+t2.getTotal()));
	}

}
