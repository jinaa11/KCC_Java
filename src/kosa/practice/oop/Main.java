package kosa.practice.oop;

public class Main {

	public static void main(String[] args) {
		OracleDao od = new OracleDao();
		MySQLDao md = new MySQLDao();
		
		MyService service = new MyService(new Dao() {
			
			@Override
			public void insert() {
				System.out.println("MySQLDao insert »£√‚");
				
			}
		});
		service.insertService();
	}

}
