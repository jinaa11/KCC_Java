package kosa.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÀÔ·Â: ");
		String str = sc.nextLine();
		
		// abc ¹®ÀÚ Æ÷ÇÔ ¿©ºÎ Ã¼Å©: 
//		if(str.matches(".*abc.*")) { // abc ¹®ÀÚ¸¸ ÀÖÀ¸¸é µÊ
//			System.out.println("¸ÅÄª");
//		} else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ¼ýÀÚ¸¸ 3ÀÚ¸® À¯¹« ÆÇ´Ü => \\ ¿ª½½·¹½Ã 2°³°¡ 
//		if(str.matches("[\\d]{3}")) { 
//			System.out.println("¸ÅÄª");
//		} else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ¾ËÆÄºª, ¼ýÀÚ¸¸ 5ÀÚ¸® ÀÌ»ó
//		if(str.matches("[\\w]{5,}")) { 
//			System.out.println("¸ÅÄª");
//		} else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ÇÑ±Û 3~5
//		if(str.matches("[°¡-ÆR]{3,5}")) { // abc ¹®ÀÚ¸¸ ÀÖÀ¸¸é µÊ
//			System.out.println("¸ÅÄª");
//		} else {
//			System.out.println("ºñ¸ÅÄª");
//		}
		
		// ÀÌ¸ÞÀÏ °ËÁõ
		// jan2047@naver.com => ¸ÅÄª
		// 123jan2047@naver.com => ºñ¸ÅÄª
		// jan2047naver.com => ºñ¸ÅÄª
		// jan2047@naver.comcom => ºñ¸ÅÄª
		if(str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) { // abc ¹®ÀÚ¸¸ ÀÖÀ¸¸é µÊ
			System.out.println("¸ÅÄª");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
		} else {
			System.out.println("ºñ¸ÅÄª");
		}
	}

}
