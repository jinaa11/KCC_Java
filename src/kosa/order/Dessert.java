package kosa.order;

public class Dessert extends MenuItem {
	private int calories;
	
	public Dessert() {}

	public Dessert(String name, int price, String description, int calories) {
		super(name, price, description);
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
