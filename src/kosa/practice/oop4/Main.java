package kosa.practice.oop4;

import kosa.oop6.MyNumber;

public class Main {

	public static void main(String[] args) {
		MyType my1 = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("�͸� Ŭ���� ����");
			}
		};
		my1.hello();
		
		MyType my2 = () -> System.out.println("���ٽ� ����");
		my2.hello();
		
		YourType you1 = msg -> System.out.println("msg: " + msg);
		you1.talk("�ȳ�!!");
		
		MyNumber myNum = (x, y) -> (x > y) ? x : y;
		System.out.println(myNum.getMax(10, 20));
	}

}
