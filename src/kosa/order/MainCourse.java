package kosa.order;

public class MainCourse extends MenuItem {
	private String baked;
	
	public MainCourse() {}

	public MainCourse(String name, int price, String description, String baked) {
		super(name, price, description);
		this.baked = baked;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("±Á±â Á¤µµ: " + baked);
		System.out.println("------------------------");
	}

	public String getBaked() {
		return baked;
	}

	public void setBaked(String baked) {
		this.baked = baked;
	}
	
	
}
