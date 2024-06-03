package kosa.oop2;

public class Main {

	public static void main(String[] args) {
		OracleDao dao = new OracleDao();
		MySQLDao dao2 = new MySQLDao();	
		
		MyService service = new MyService(dao2);
		service.insertService();
	}

}
