package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
	LinkedList<Order> queue;
	Scanner sc = new Scanner(System.in);
	Food food[]; 

	public Manager() {
		queue = new LinkedList<Order>();
		food = new Food[]{
				new Food("���", 3000),
				new Food("��ġ������", 5000),
				new Food("������", 5000),
				new Food("���", 4000),		
				new Food("��������", 7000),		
		};
	}

	public void addOrder() {
		for(int i = 0; i < food.length; i++) {
			food[i].show();
		}
		System.out.print("�ֹ��� �޴�: ");
		String foodName = sc.nextLine();
//		if(foodName.equals())
//		queue.offer(new Order(foodName, ))
	}
}
