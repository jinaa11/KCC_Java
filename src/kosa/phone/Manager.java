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
		System.out.print("검색할 이름: ");
		String name = sc.nextLine();
		for(int i = 0; i < count; i++) {
			if(name.equals(arr[i].getName())) {
				System.out.println("검색한 이름: " + name);
				arr[i].show();
			}
		}
		
	}
}
