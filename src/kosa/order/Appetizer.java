package kosa.order;

public class Appetizer extends MenuItem {
	private boolean glutenFree;
	
	public Appetizer() {}

	public Appetizer(String name, int price, String description, boolean glutenFree) {
		super(name, price, description);
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}

	public void setGlutenFree(boolean glutenFree) {
		this.glutenFree = glutenFree;
	}
	
	
}
