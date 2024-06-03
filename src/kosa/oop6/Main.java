package kosa.oop6;

public class Main {

	public static void main(String[] args) {
		// MyType => 익명 내부 클래스로 구현해보자.
		MyType my1 = new MyType() {

			@Override
			public void hello() {
				System.out.println("익명 클래스 형식입니다.");
			}
		};

		my1.hello();

		// 람다식으로 구현
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		my2.hello();

		MyType my3 = () -> System.out.println("람다식 형식2입니다.");
		my3.hello();

		YourType you = (String message) -> {
			System.out.println("메시지: " + message);
		};
		you.talk("안녕~~");

		YourType you2 = message -> System.out.println("메시지2: " + message);
		you2.talk("hello");

		// MyNumber 추상 메서드 구현(람다식)
		MyNumber myNum = (x, y) -> {
			if (x > y) {
				return x;
			} else {
				return y;
			}
		};
//		MyNumber myNum = (x, y) -> (x > y) ? x : y;
		System.out.println("max 값: " + myNum.getMax(13, 5));

		// Runnable => 람다식 구현
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
