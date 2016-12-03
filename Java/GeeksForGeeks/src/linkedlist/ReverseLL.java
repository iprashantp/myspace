package linkedlist;

public class ReverseLL {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);

		// ReverseList();
		 ReverseListReccursive(head);

		if (head != null)
			PrintList();

	}

	private static void ReverseList() {
		if (head == null)
			return;
		Node next = head.getNext();
		Node current = head;
		Node prev = null;

		while (next != null) {
			current.setNext(prev);
			prev = current;
			current = next;
			next = next.getNext();
		}
		current.setNext(prev);
		head = current;
	}

	private static void ReverseListReccursive(Node node) {
		if (node == null)
			return;

		Node first = node;
		Node rest = node.getNext();

		if (rest == null) {
			head = first;
			return;
		}

		ReverseListReccursive(rest);

		first.getNext().setNext(first);
		first.setNext(null);
	}

	private static void PrintList() {
		while (head != null) {
			System.out.print(head.getValue());
			if (head.getNext() != null)
				System.out.print("-->");
			head = head.getNext();

		}

	}

}
