package kosa.basic;

public class CallByExam {

	// num은 지역변수로 메소드가 끝나면 사라짐, 따라서 리턴으로 값을 변화 시켜야 함
	public static int change(int num) {
		num += 10;
		return num;
	}
	
	public static void change2(int brr[]) {
		brr[0] = 200;
	}

	public static void main(String[] args) {
		// 값에 의한 호출(call by value) -> 메소드에서 호출해도 원래의 값은 변하지 않음
//		int num = 10; 
//		num = change(num);
//		System.out.println(num);

//		int arr[] = { 100 };
//		change2(arr);
//		System.out.println(arr[0]);
		
		int arr[] = {1,2,3};
		int brr[] = arr;
		
		// arr과 brr은 서로 값은 주소 값을 참조하고 있기 때문에
		// brr에서 값을 변경시키면 arr도 같이 변경 됨
		brr[0] = 100; 
		System.out.println(arr[0]);
	}

}
