package bitstudy.queue;

public class ArrayQueue implements Queue {
	int rear;
	int front;
	int size;
	char[] array;
	
	public ArrayQueue(int size) {
		rear = -1;
		front = -1;
		this.size = size;
		array = new char[size];
	}
	@Override
	public boolean isEmpty() {
		return (front == rear);
	}
	
	public boolean isFull() {
		return ( rear + 1 == size );
	}

	@Override
	public void enQueue(char item) {
		if( isFull() ) {
			return;
		} else {
			array[++rear] = item;
		}
	}

	@Override
	public char deQueue() {
		if( isEmpty() ) {
			return 0;
		} else {
			return array[++front];
		}
	}

	@Override
	public void delete() {
		if( isEmpty() ) {
			return;
		} else {
			++front;
		}
	}
	
	public char peek() {
		if( isEmpty() ) {
			return 0;
		} else {
			return array[++front];
		}
	}
	
	public void showQueue() {
		if( isEmpty() ){
			System.out.println(0);
		} else {
			for( int i = (front+1); i <= rear; i++ ){
				System.out.println(array[i]);
			}
		}
	}

}
