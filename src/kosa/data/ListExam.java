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
		// 1~45 �ߺ����� �ʴ� �ζ� ��ȣ 6�� ���
		// 1. �迭
		Random r = new Random();
//		
//		int arr[] = new int[6];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--; // ������ ���ο� i�� �ٽ� ����
//				}
//			}
//		}
//		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		// 2. List ����
		// ���׸��� Ư�� ������ Ÿ���� ���� �� �ְ� ����
//		List<Integer> list = new ArrayList<Integer>();
//		
//		while(true) {
//			int n = r.nextInt(45) + 1;
//			if(list.contains(n)) { // ����Ʈ�� n�� �����ϴ���
//				continue;
//			} else {
//				list.add(n);
//			}
//			if(list.size() == 6) break;
//		}
//		
//		Collections.sort(list);
//		System.out.println(list);
		
		// 3. Set ����(TreeSet) ==> �ߺ� ��� X
		Set<Integer> set = new TreeSet<Integer>(); // TreeSet�� �ڵ� �������� ����
		
		for(int i = 0; set.size() < 6; i++) { // set ����� 6�� �� ������ �ݺ�, �ߺ��Ǹ� ������ ���� ����
			set.add(r.nextInt(45) + 1);
		}
		
		System.out.println(set);
	}

}
