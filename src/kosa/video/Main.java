package kosa.video;

public class Main {

	public static void main(String[] args) {
		GeneralMember gm1 = new GeneralMember("aaa", "È«±æµ¿", "µ¿Åº");
		GeneralMember gm2 = new GeneralMember("bbb", "±èÃ¶¼ö", "¼­¿ï");
	
		Video v1 = new Video(1, "Æ®·£½ºÆ÷¸Ó3", "¼­ºÀ¼ö");
		Video v2 = new Video(2, "ÄôÇªÆÒ´õ2", "Áö¼º¹Î");
		
		gm1.rent(v1);
		gm1.show();

	}
}
