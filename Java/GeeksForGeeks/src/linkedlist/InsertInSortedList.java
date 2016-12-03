package linkedlist;

public class InsertInSortedList {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 7);
		int n = 11;
		Insert(n);
		while (head != null) {
			System.out.print(head.getValue());
			if (head.getNext() != null)
				System.out.print("-->");
			head = head.getNext();
		}
	}

	private static void Insert(int n) {
		Node node = new Node(n);

		if (head == null) {
			head = node;
			return;
		} else if (n < head.getValue()) {
			node.setNext(head);
			head = node;
			return;
		}
		Node current = head;
		Node next = current.getNext();
		while (current != null) {
			if (next == null) {
				current.setNext(node);
				break;
			}
			if (n < next.getValue()) {
				current.setNext(node);
				node.setNext(next);
				break;
			}
			current = next;
			next = next.getNext();

		}
		return;
	}
}
