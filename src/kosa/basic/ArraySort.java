package kosa.basic;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		// 배열 내용 정렬
		int arr[] = { 3, 2, 5 };
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// 내림차순 출력 방법 1(for문)
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[arr.length - 1 -i] + ", ");
//		}
		// 내림차순 출력 방법 2(for문)
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + ", ");
		}

		int arr2[][] = { { 2, 90 }, { 1, 60 }, { 3, 20 } };
		Arrays.sort(arr2, new Comparator<int[]>() {

			// 직접 정렬 기준 정하기
			@Override
			public int compare(int[] o1, int[] o2) {
				// 정렬 기준 작성 => 2차원 배열 안에 1차원 첫 번째 인덱스를 기준으로 오름차순
				if (o1[0] < o2[0]) {
					return -1; // 바꾸지 않고 그대로 두기(-1 리턴)
				} else if (o1[0] > o2[0]) {
					return 1; // 바꾸기(양수 리턴)
				} else {
					return 0;
				}
			}
		});

		System.out.println(Arrays.deepToString(arr2));

	}

}
