package linkedlist;

public class Node {
	private int value;
	private Node next;

	public Node() {
		value = 0;
		next = null;
	}

	public Node(int value) {
		this.value = value;
		next = null;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return this.next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node AddToList(Node head, int value) {
		Node node = new Node();
		Node temp = new Node();
		node.setValue(value);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(node);
		}

		return head;
	}

	public Node AddNodeToList(Node head, Node node) {
		Node listIter = null;
		listIter = head;
		if (head == null)
			return node;
		else if (node == null)
			return head;
		else {
			while (listIter.getNext() != null) {
				listIter = listIter.getNext();
			}
			listIter.setNext(node);
		}
		return head;
	}
	
	public static void PrintList(Node head){
		Node listIter = head;
		while (listIter != null) {
			System.out.print(listIter.getValue());
			if (listIter.getNext() != null)
				System.out.print("-->");
			listIter = listIter.getNext();
		}
	}
}