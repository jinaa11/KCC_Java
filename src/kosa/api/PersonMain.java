package kosa.api;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);
		
		// ==는 주소값이 같은지 비교
		if(p1.equals(p2)) { // .equals를 하면 Person에는 equals 함수가 없기 때문에 부모의 Object에 있는 equals를 사용(주소 값을 비교함)
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(p1.toString()); // Object에 있는 toString 호출
	} 

}
