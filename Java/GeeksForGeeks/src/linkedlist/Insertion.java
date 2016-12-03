package linkedlist;

public class Insertion {
	private static Node head = new Node();

	public static void main(String[] args) {
		
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		 // Add(4);
		 //Add(4,5);
		 AddEnd(4);
		printList();

	}

	/**
	 * print Linded List
	 */
	public static void printList() {
		while (head != null) {
			System.out.print(head.getValue());
			head = head.getNext();
			if (head != null) {
				System.out.print("-->");
			}
		}
	}

	/**
	 * add to head
	 * 
	 * @return
	 */
	public static void Add(int value) {
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;
		return ;
	}

	/**
	 * add to Nth
	 */
	public static Node Add(int value, int n) {
		Node node = new Node();
		node.setValue(value);
		if(n<=0){
			System.out.println("position doesnt exist");
			return null;
		}
		if(n==1){
			node.setNext(head);
			return node;
		}
		Node temp = new Node();
		temp.setNext(head);
		
		while (--n > 0 && temp != null) {
			temp=temp.getNext();
		}
		if(n>0 || temp==null) {
			System.out.println("position doesnt exist!!");
			head=null;
		}
		else{
			node.setNext(temp.getNext());
			temp.setNext(node);
		}

		return head;
	}

	/**
	 * add to end
	 */
	public static Node AddEnd(int value) {
		Node node = new Node();
		Node temp = new Node();
		node.setValue(value);
		if (head == null) {
			head = node;
		} else {
			temp=head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}

		return head;
	}

}

/*
 * class Node{ private int data; private Node next;
 * 
 * Node(){ this.data= 0; this.next = null; }
 * 
 * public int getData(){ return this.data; } public void setValue(int value){
 * this.data=value; } public Node getNext(){ return this.next; } public void
 * setNext(Node node){ this.next=node; }
 * 
 * 
 * }
 */