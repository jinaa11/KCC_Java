package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
//		String data[] = {
//				"bat", "bba", "bbg", "bonus",
//				"CA", "ca", "c232", "car",
//				"date", "dic", "diraaa"
//		};
//		
//		Pattern p = Pattern.compile("^[a-zA-Z0-9]*$");
//		
//		for(int i = 0; i < data.length; i++) {
//			Matcher m = p.matcher(data[i]); // p의 패턴과 data 배열에 있는 값이 매치되는 것 찾기
//			if(m.matches()) {
//				System.out.println(data[i]);
//			}
//		}
		
//		String source = "ab?cd?ef?gh";
//		String reg = "(\\w*)"; // 그룹의 기준점
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
	}

}
