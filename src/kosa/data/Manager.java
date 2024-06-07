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
				new Food("±è¹ä", 3000),
				new Food("±èÄ¡ººÀ½¹ä", 5000),
				new Food("¶±ººÀÌ", 5000),
				new Food("¶ó¸é", 4000),		
				new Food("Á¦À°ººÀ½", 7000),		
		};
	}

	public void addOrder() {
		for(int i = 0; i < food.length; i++) {
			food[i].show();
		}
		System.out.print("ÁÖ¹®ÇÒ ¸Þ´º: ");
		String foodName = sc.nextLine();
//		if(foodName.equals())
//		queue.offer(new Order(foodName, ))
	}
}
