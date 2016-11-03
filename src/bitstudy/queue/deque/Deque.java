package bitstudy.queue.deque;

class DQNode {
	char data;
	DQNode lLink;
	DQNode rLink;
}
public class Deque {
	DQNode front;
	DQNode rear;
	
	public Deque() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty(){
		if( front== null ){
			return true;
		} 
		return false;
	}
	
	public void insertFront(char data){
		DQNode node = new DQNode();
		node.data = data;
		if( isEmpty() ){
			front = node;
			rear = node;
		} else {
			front.lLink = node;
			node.rLink = front;
			front = front.lLink;
		}
	}
	
	public void insertRear(char data){
		DQNode node = new DQNode();
		node.data = data;
		if( isEmpty() ){
			front = node;
			rear = node;
		} else {
			rear.rLink = node;
			node.lLink = rear;
			rear = rear.rLink;
		}
	}
	
	public void deleteFront() {
		if( isEmpty() ){
			System.out.println("삭제없음");
		} else if (front == rear ){
			front = null;
			rear = null;
		} else {
			front.rLink.lLink = null;
			front = front.rLink;
		}
	}
	
	public void deleteRear() {
		if( isEmpty() ){
			System.out.println("삭제없음");
		} else if ( front == rear ){
			front = null;
			rear = null;
		} else {
			rear.lLink.rLink = null;
			rear = rear.lLink;
		}
	}
	
	public void show(){
		if( isEmpty() ) {
			System.out.println("비었습니다.");
		} else {
			DQNode temp = new DQNode();
			temp = front;
			while( temp.rLink != null ) {
				System.out.println( temp.data );
				temp = temp.rLink;
			}
			System.out.println( temp.data );
		}
	}
}
