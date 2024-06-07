package kosa.data;

import java.util.LinkedList;
import java.util.Scanner;

public class Order extends Food {
	private int amount;
	private Food food[];
	LinkedList<Order> queue;
	Scanner sc = new Scanner(System.in);
	
	public Order() {
		queue = new LinkedList<Order>();
		food = new Food[]{
				new Food("±è¹ä", 3000),
				new Food("±èÄ¡ººÀ½¹ä", 5000),
				new Food("¶±ººÀÌ", 5000),
				new Food("¶ó¸é", 4000),		
				new Food("Á¦À°µ¤¹ä", 7000),		
		};
	}
	
	public Order(String foodName, int price, int amount) {
		super(foodName, price);
		this.amount = amount;
	}
	
	public void addOrder() {
		for(int i = 0; i < food.length; i++) {
			food[i].show();
		}
		System.out.print("ÁÖ¹®ÇÒ ¸Þ´º: ");
		String foodName = sc.nextLine();
		System.out.print("¼ö·®: ");
		amount = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < food.length; i++) {
			if(foodName.equals(food[i].getFoodName())) {
				queue.offer(new Order(foodName, food[i].getPrice(), amount));
			}
		}
	}
	
	public void showOrder() {
		for (Order order : queue) {
            System.out.println("Å¥: " + order);
        }
	}
	
	public void totalMenu() {
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	}
	
	
	@Override
	public String toString() {
		return "Order [À½½Ä¸í=" + getFoodName() + ", °¡°Ý=" + getPrice() + ", ¼ö·®=" + amount + "]";
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
