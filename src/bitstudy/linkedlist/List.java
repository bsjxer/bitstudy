package bitstudy.linkedlist;

public class List {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.insertHead("c");
		link.insertHead("b");
		link.insertHead("a");
		
		link.insertTail("d");
		
		link.show();
	}
}
