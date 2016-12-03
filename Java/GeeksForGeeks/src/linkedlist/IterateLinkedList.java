package linkedlist;

public class IterateLinkedList {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);
		head.setNext(first);
		first.setNext(second);
		second.setNext(third);
		printList(head);
		
	}
	private static void printList(Node head){
		Node currentNode=head;
		while(currentNode!=null){
			System.out.print(currentNode.getValue());
			currentNode=currentNode.getNext();
			if(currentNode!=null)
				System.out.print("-->");
		}
	}

}
