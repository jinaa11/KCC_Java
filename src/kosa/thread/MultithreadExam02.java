package kosa.thread;

public class MultithreadExam02 {

	public static void main(String[] args) {
		Thread thread = new Thread(new SmallLetters());
		thread.start();

		char arr[] = { '��', '��', '��', '��', '��', '��', '��',
				'��', '��', '��', '��', '��', '��', '��' };
		
		for(char ch : arr) {
			System.out.print(ch);
		}
	}

}
