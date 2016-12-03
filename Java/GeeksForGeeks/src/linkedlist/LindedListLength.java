package linkedlist;

public class LindedListLength {

	public static void main(String[] args) {
		Node head = new Node();
		int length = 0;
		head.setValue(1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);

		// length = getLengthIterative(head);
		length = getLengthReccursive(head);
		System.out.println("length: " + length);
	}

	public static int getLengthIterative(Node head) {
		int length = 0;
		Node lListIterator = head;
		while (lListIterator != null) {
			lListIterator = lListIterator.getNext();
			length++;
		}
		return length;
	}

	public static int getLengthReccursive(Node head) {
		int length = 0;
		if (head != null) {
			Node lListIterator = head;
			length = 1 + getLengthIterative(lListIterator.getNext());
		}
		return length;
	}

}
