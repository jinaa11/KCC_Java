package kosa.data;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Order o = new Order();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�ֹ� ��û 2.�ֹ� ó�� 3.����� �Ѿ� 4.����");
			System.out.print("�޴�: ");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				o.addOrder();
				break;
			case "2":
				o.showOrder();
				break;
			case "3":
				
				break;
			case "4":
				System.out.println("���α׷� ����");
				return;
			}
		}
		

	}

}
