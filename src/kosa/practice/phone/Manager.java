package kosa.practice.phone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {
	List<PhoneInfo> list = null;
	Scanner sc = null;
	
	public Manager() {
		list = new ArrayList<PhoneInfo>();
		sc = new Scanner(System.in);
	}
	
	public void addPhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();
		
		list.add(new PhoneInfo(name, phoneNo, birth));
	}
	
	public void listPhoneInfo() {
		for(PhoneInfo p : list) {
			p.show();
		}
	}
	
	public void searchPhoneInfo() {
		System.out.print("검색할 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				list.get(i).show();
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("일치하는 이름이 없습니다.");
		}
	}
	
	public void updatePhoneInfo() {
		System.out.print("수정할 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.print("수정할 전화번호: ");
				String phoneNo = sc.nextLine();
				list.get(i).setPhoneNo(phoneNo);
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("일치하는 이름이 없습니다.");
		}
	}
	
	public void deletePhoneInfo() {
		System.out.print("삭제할 이름: ");
		String name = sc.nextLine();
		int idx = -1;
		
		for(int i = 0; i < list.size(); i++) {
			if(name.equals(list.get(i).getName())) {
				list.remove(i);
				idx = i;
			}
		}
		
		if(idx == -1) {
			System.out.println("일치하는 이름이 없습니다.");
		}
	}
	
	public void sortPhoneInfo() {
		System.out.println("1. 이름 오름차순 2. 생년월일 내림차순");
		System.out.print("메뉴: ");
		String menu = sc.nextLine();
		
		switch(menu) {
		case "1":
			Collections.sort(list);
			break;
		case "2":
			Collections.sort(list, new Comparator<PhoneInfo>() {

				@Override
				public int compare(PhoneInfo o1, PhoneInfo o2) {
					if(o1.getBirth().compareTo(o2.getBirth()) > 0) {
						return -1;
					} else if(o1.getBirth().compareTo(o2.getBirth()) < 0) {
						return 1;
					}
					return 0;
				}
				
			});
		}
	}
	
	public void storePhoneInfo() {
		// 객체 저장
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
			oos.writeObject(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {}
		}
	}
	
	public void getPhonInfo() {
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("list.txt"));
			list = (List<PhoneInfo>)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (Exception e2) {}
		}
		
	}

}
