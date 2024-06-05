package kosa.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class ListExam {

	public static void main(String[] args) {
		// 1~45 중복되지 않는 로또 번호 6개 출력
		// 1. 배열
		Random r = new Random();
//		
//		int arr[] = new int[6];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--; // 기존의 새로운 i를 다시 받음
//				}
//			}
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// 2. List 구현
		// 제네릭은 특정 데이터 타입을 넣을 수 있게 만듦
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45) + 1;
//			if(list.contains(n)) { // 리스트에 n이 존재하는지
//				continue;
//			} else {
//				list.add(n);
//			}
//			if(list.size() == 6) break;
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		// 3. Set 구현(TreeSet) ==> 중복 허용 X
		Set<Integer> set = new TreeSet<Integer>(); // TreeSet은 자동 오름차순 정렬
		
		for(int i = 0; set.size() < 6; i++) { // set 사이즈가 6이 될 때까지 반복, 중복되면 데이터 넣지 않음
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);
	}

}
