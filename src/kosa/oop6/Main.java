package kosa.oop6;

public class Main {

	public static void main(String[] args) {
		// MyType => �͸� ���� Ŭ������ �����غ���.
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				System.out.println("�͸� Ŭ���� �����Դϴ�.");
			}
		};

		my1.hello();

		// ���ٽ����� ����
		MyType my2 = () -> {
			System.out.println("���ٽ� �����Դϴ�.");
		};
		my2.hello();

		MyType my3 = () -> System.out.println("���ٽ� ����2�Դϴ�.");
		my3.hello();

		YourType you = (String message) -> {
			System.out.println("�޽���: " + message);
		};
		you.talk("�ȳ�~~");

		YourType you2 = message -> System.out.println("�޽���2: " + message);
		you2.talk("hello");

		// MyNumber �߻� �޼��� ����(���ٽ�)
		MyNumber myNum = (x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		};
//		MyNumber myNum = (x, y) -> (x > y) ? x : y;
		System.out.println("max ��: " + myNum.getMax(13, 5));

		// Runnable => ���ٽ� ����
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	}

}
