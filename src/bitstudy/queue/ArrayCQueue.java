package bitstudy.queue;

public class ArrayCQueue implements Queue {
	int rear;
	int front;
	int size;
	char[] array;
	
	
	public ArrayCQueue(int size) {
		rear = 0;
		front = 0;
		this.size = size;
		array = new char[size];
	}

	@Override
	public boolean isEmpty() {
		return (rear == front);
	}

	@Override
	public void enQueue(char item) {
		if( (rear+1)%size == front) {
			System.out.println("큐가 꽉찾습니다.");
		} else {
			rear=(rear+1)%size;
			array[rear] = item;
		}
	}

	@Override
	public char deQueue() {
		if ( isEmpty() ){
			return 0;
		} else {
			front=(front+1)%size;
			return array[front];
		}
	}

	@Override
	public void delete() {
		if ( isEmpty() ){
			System.out.println("비었습니다.");
		} else {
			front=(front+1)%size;
			System.out.println("삭제했습니다.");
		}
	}

	public void show() {
		if (isEmpty()) {
			System.out.println("비어서 보여줄게 없다");
		} else {
			if( (front + 1)%size < rear ){
				for(int i = (front+1)%size; i <= rear; i++ ) {
					System.out.println(array[i]);
				}
			} else {
				for( int i = (front+1)%size; i < size; i++ ){
					System.out.println(array[i]);
				}
				for( int i = 0; i <= rear; i++ ){
					System.out.println(array[i]);
				}
			}
		}

	}
}