package kosa.phone;

import java.util.Scanner;

// 전화번호 관리 전반적인 기능
public class Manager {
//	private PhoneInfo arr[] = new PhoneInfo[10];
	private PhoneInfo arr[];
	private Scanner sc;
	private int count;
	
	public Manager() {
		arr = new PhoneInfo[10];
		sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
		// 키보드로부터 이름, 전화번호, 생년월일을 입력 받아
		// PhoneInfo 객체를 생성해서 배열에 추가하는 것
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		arr[count++] = new PhoneInfo(name, phoneNo, birth);
	};
	
	public void listPhoneInfo() {
		for(int i = 0; i < count; i++) {
			arr[i].show();
		}
	}
	
	public void searchPhoneInfo() {
		// 검색하고자 하는 이름으로 1개의 PhoneInfo 객체의 내용 출력
		System.out.print("검색할 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i].getName())) {
				System.out.println("검색한 이름: " + name);
				arr[i].show();
				idx = i;
			}
		}
		
		// 검색된 내용이 없는 경우
		if(idx == -1) {
			System.out.println("존재하지 않는 이름입니다.");
		}
		
	}
}
