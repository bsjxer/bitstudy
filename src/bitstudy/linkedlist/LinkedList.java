package bitstudy.linkedlist;

class Node {
	String data;
	Node link;
}

public class LinkedList {
	Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void insertHead(String data) {
		if( head == null) {
			Node newNode = new Node();
			newNode.data = data;
			head = newNode;
		}  
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = head;
		
		head = newNode;
	}
	
	public void insertTail(String data){
		Node temp = head;
		while( temp.link != null ) {
			temp = temp.link;
		}
		Node newNode = new Node();
		newNode.data = data;
		temp.link = newNode;
	}
	
	public void insertMiddle(int a, String data){
		Node temp = head;
		for( int i = 0; i<a; i++ ){
			temp = temp.link;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.link = temp.link;
		temp.link = newNode;
	}

	public void show(){
		Node temp = head;
		while ( temp.link != null ) {
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	
}
