package kosa.basic;

public class CallByExam {

	// num�� ���������� �޼ҵ尡 ������ �����, ���� �������� ���� ��ȭ ���Ѿ� ��
	public static int change(int num) {
		num += 10;
		return num;
	}
	
	public static void change2(int brr[]) {
		brr[0] = 200;
	}

	public static void main(String[] args) {
		// ���� ���� ȣ��(call by value) -> �޼ҵ忡�� ȣ���ص� ������ ���� ������ ����
//		int num = 10; 
//		num = change(num);
//		System.out.println(num);

//		int arr[] = { 100 };
//		change2(arr);
//		System.out.println(arr[0]);
		
		int arr[] = {1,2,3};
		int brr[] = arr;
		
		// arr�� brr�� ���� ���� �ּ� ���� �����ϰ� �ֱ� ������
		// brr���� ���� �����Ű�� arr�� ���� ���� ��
		brr[0] = 100; 
		System.out.println(arr[0]);
	}

}
