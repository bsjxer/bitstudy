package bitstudy.queue.deque;

public class test {

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.insertFront('A');
		dq.insertFront('B');
		dq.insertRear('C');
		dq.insertRear('D');
		dq.insertRear('E');
		
		dq.isEmpty();
		dq.show();
		
		System.out.println("-----------");
		dq.deleteFront();
		dq.deleteRear();
		dq.show();
	}

}

