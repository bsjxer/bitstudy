package bitstudy.queue;

public class ABC {

	public static void main(String[] args) {
		// int queueSize = 3;
		// ArrayQueue Q = new ArrayQueue(queueSize);
		//
		// Q.enQueue('A');
		// Q.enQueue('B');
		// Q.enQueue('C');
		// Q.showQueue();
		//
		// Q.deQueue();
		// Q.showQueue();
		//

		int queueSize = 4;
		ArrayCQueue Q = new ArrayCQueue(queueSize);

		Q.enQueue('A');
		Q.enQueue('B');
		Q.enQueue('C');
		Q.show();

		Q.deQueue();
		Q.show();

		Q.enQueue('D');
		Q.show();

		Q.deQueue();
		Q.deQueue();
		Q.show();

		
		System.out.println("-------------");
		Q.enQueue('E');
		Q.enQueue('F');
		Q.show();

	}

}
