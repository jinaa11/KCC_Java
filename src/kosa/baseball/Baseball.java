package kosa.baseball;

public class Baseball {
	String strike;
	String ball;
	int sCount;
	int bCount;
	int result = 0;

	public Baseball() {
	}

	public int checkStrike(int arr[], int answer[]) {
		sCount = 0;
		bCount = 0;
		result++;
		for (int i = 0; i < answer.length; i++) {
			// strike üũ
			if (arr[i] == answer[i]) {
				sCount++;
			} else {
				// ball üũ
				for (int j = 0; j < arr.length; j++) {
					if (answer[i] == arr[j]) {
						bCount++;
					}
				}
			}
		}
		System.out.println(sCount + "S" + bCount + "B");
		if (sCount == 3) {
			System.out.println(sCount + "Strike");
			System.out.println(result + "��° ����!");
		}
		return sCount;
	}

}
