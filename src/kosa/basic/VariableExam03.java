package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		// 지역(로컬)변수 특징 2가지
				// 1. 반드시 초기화 후 사용해야 한다.
				// 2. 선언된 변수는 정의된 범위 안에서만 사용 가능하다.

				// 변수는 초기화 해야 한다는 것의 예시
//				int num;

//				num = num + 1;
//				System.out.println(num);

				int num = 0;

				num = num + 1;
				System.out.println(num);

				// a 라는 변수는 if 범위 안에서만 사용할 수 있다.
//				if(num==1) {
//					int a = 100;
//				}
//				System.out.println("a :" + a);

				// 변수를 미리 초기화시킨다면 if 절 밖에서도 사용할 수 있다.
				int a = 0;
				if (num == 1) {
					a = 100;
				}
				System.out.println("a :" + a);

				int i = 1;
				for (; i <= 10; i++) {
					System.out.print(i + ",");
				}

				System.out.println();
				System.out.println("최종 i값 : " + i);

				// 변수 사용시 고민?
				// 1. 어떤 종류의 데이터 ? => 데이터 타입 선언 결정
				// 2. 데이터를 어디까지 사용하는지? => 마지막 사용범위를 알아야함 => 변수 선언 위치가 달라지므로 결정할 필요가 있음

				
				// 연산자 %
				
				System.out.println(10%3);
				
				// 조건식에서 실행되지 않기 때문에 데드코드가 발생한다.
				if(11%2 == 0) {
					System.out.println("2의 배수이다.");
				} else {
					System.out.println("2의 배수가 아니다.");
				}
				
				// 복합연산자 & 증감자
				int num2 = 1;
				num2 = num2 +1 ;
				num2 += 1;
				num2++;
				
				System.out.println(num2);
				
				int x = 10;
				int y = 0;
				
				
				// 후치증감자와 전치증감자의 차이
				// 전치 증감자는 먼저 출력한 후 증가가 되므로 원래라면 변수에 +1이 된 상태로 나와야하지만 출력의 상태는 변수 그대로의 형태로 나옴
				// 후치 증감자는 증가가 된 이후에 출력이 되므로 원래 변수의 +1의 상태로 출력된다.
				y = x++;
//				y = ++x;
				
				System.out.println("첫번쨰 y :" + y);
				System.out.println("두번째 y :" + y++);
				System.out.println("세번쨰 y :" + y);
				System.out.println("네번째 y :" + ++y);
				System.out.println();
				System.out.println("첫번째 x :" + x);
				System.out.println("두번쨰 x :" + x++);
				System.out.println("세번째 x :" + ++x);
				
				System.out.println("마지막 x :" + x);
				
				
				
				
				// 삼항연산자 (조건연산자)
				
				int b = 40;
				int c = 20;

				int max = (b>c) ? b : c;
				
				System.out.println(max);

	}

}
