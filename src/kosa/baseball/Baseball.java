package kosa.baseball;

public class Baseball {
	String strike;
	String ball;
	int sCount;
	int bCount;
	int result;
	
	public Baseball() {}
	
	public void checkStrike(int arr[], int answer[]) {
		sCount = 0;
		bCount = 0;
		for(int i = 0; i < answer.length; i++) {
			
			result++;
			// strike üũ
			if(arr[i] == answer[i]) {
				sCount++;
//				System.out.print(sCount + "S");
			} else {
				// ball üũ
				for(int j = 0; j < arr.length; j++) {
					if(answer[i] == arr[j]) {
						bCount++;
//						System.out.print(bCount + "B");
					}
				}
				
				System.out.println();
			}
			System.out.print(sCount + "S");
			System.out.print(bCount + "B");
		}
		if(sCount == 3) {
			System.out.println(sCount + "Strike");
			System.out.println(result + "��° ����!");
			return;
		}
	}
	
	public void checkBall() {
		
	}

}
