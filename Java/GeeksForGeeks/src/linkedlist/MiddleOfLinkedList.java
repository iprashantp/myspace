package linkedlist;

public class MiddleOfLinkedList {
	public static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		head.AddToList(head, 8);
		Node.PrintList(head);

		Node middleNode = GetMiddleNode();
		if (middleNode != null)
			System.out.println("middle node value: " + middleNode.getValue());
		else
			System.out.println("empty linked list");
	}

	public static Node GetMiddleNode() {
		if (head == null)
			return null;

		Node fastIter = head;
		Node slowIter = head;

		while (fastIter != null && fastIter.getNext() != null) {

			slowIter = slowIter.getNext();
			fastIter = fastIter.getNext().getNext();

		}
		return slowIter;
	}

}
