package kosa.video;

public class Main {

	public static void main(String[] args) {
//		GeneralMember gm1 = new GeneralMember("aaa", "홍길동", "동탄");
//		GeneralMember gm2 = new GeneralMember("bbb", "김철수", "서울");

//		Video v1 = new Video(1, "트랜스포머3", "서봉수");
//		Video v2 = new Video(2, "쿵푸팬더2", "지성민");
		
		Video videos[] = {
				new Video(1, "트랜스포머3", "서봉수"),
				new Video(2, "쿵푸팬더2", "지성민")
		};

		// GeneralMember와 SpecialMember를 함께 배열에 넣고
		// 각각의 rental(), show() 호출 후 출력
		// 특히 SpecialMember는 specialPrint() 호출되도록 하여라.
		GeneralMember arr[] = { 
				new GeneralMember("aaa", "홍길동", "동탄"), 
				new SpecialMember("bbb", "김철수", "혜화", 100) 
				};

		// 다형성
		for (int i = 0; i < arr.length; i++) {
			arr[i].rent(videos[i]);
			arr[i].show();
			System.out.println();
			
			if (arr[i] instanceof SpecialMember) {
				((SpecialMember) arr[i]).specialPrint();
			}
		}

//		SpecialMember sm = new SpecialMember("a", "박길동", "혜화", 100);
//		sm.rent(v1);
//		sm.show();
//		sm.print();

//		gm1.rent(v2);
//		gm1.show();

	}
}
