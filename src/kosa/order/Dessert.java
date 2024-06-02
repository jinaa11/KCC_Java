package kosa.order;

public class Dessert extends MenuItem {
	private int calories;
	
	public Dessert() {}

	public Dessert(String name, int price, String description, int calories) {
		super(name, price, description);
		this.calories = calories;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Ä®·Î¸®: " + calories);
		System.out.println("------------------------");
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
