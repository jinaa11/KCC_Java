package kosa.practice.oop4;

import kosa.oop6.MyNumber;

public class Main {

	public static void main(String[] args) {
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("익명 클래스 형식");
			}
		};
		my1.hello();
		
		MyType my2 = () -> System.out.println("람다식 형식");
		my2.hello();
		
		YourType you1 = msg -> System.out.println("msg: " + msg);
		you1.talk("안녕!!");
		
		MyNumber myNum = (x, y) -> (x > y) ? x : y;
		System.out.println(myNum.getMax(10, 20));
	}

}
