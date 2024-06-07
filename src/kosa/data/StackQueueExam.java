package kosa.data;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueueExam {

	public static void main(String[] args) {
		// stack �ڷᱸ��
		Stack<Integer> stack = new Stack<Integer>();
		// Queue �ڷᱸ��
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println("--- stack ---");
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop());
//		}
		System.out.println("--- queue ---");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
