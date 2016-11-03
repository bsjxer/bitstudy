package bitstudy.queue;

class QNode {
	char data;
	QNode rear;
}

public class ArrayLinkedQueue implements Queue {
	int rear;
	int front;
	int old;
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub

	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}
}
