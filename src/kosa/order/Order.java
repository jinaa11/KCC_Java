package kosa.order;

public class Order extends MenuItem {
	MenuItem mi[];
	
	int count;

	public Order() {
		mi = new MenuItem[] {
	            new Appetizer("빵", 3000, "식전빵", true),
	            new Appetizer("스프", 5000, "양송이 스프", false),
	            new Appetizer("연어 샐러드", 7000, "신선한 연어 샐러드", false),
	            new MainCourse("안심 스테이크", 15000, "안심", "레어"),
	            new MainCourse("꽃등심 스테이크", 20000, "꽃등심", "미디움"),
	            new MainCourse("티본 스테이크", 18000, "티본", "웰던"),
	            new Dessert("에그타르트", 7000, "에그타르트", 135),
	            new Dessert("요거트", 6000, "에그타르트", 60),
	            new Dessert("초코케이크", 8000, "에그타르트", 370)
	        };	
	}
	
	public void addMenu() {
		System.out.println("1)에피타이저 2)메인코스 3)디저트");
		System.out.print("메뉴 선택: ");
		String menu = DataInput.sc.nextLine();
		System.out.println(mi.length);

		switch (menu) {
		case "1":
			System.out.println("1)에피타이저");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof Appetizer) {
					mi[i].show();
				}
			}
			break;
		case "2":
			System.out.println("2)메인코스");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof MainCourse) {
					mi[i].show();
				}
			}
			System.out.print("굽기 정도: ");
			String baked = DataInput.sc.nextLine();
			
			
			break;
		case "3":
			System.out.println("3)디저트");
			for(int i = 0; i < mi.length; i++) {
				if(mi[i] instanceof Dessert) {
					mi[i].show();
				}
			}
			break;
		}
	}
}
