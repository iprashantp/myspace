package linkedlist;

public class MergeSortedList {
	private static Node head1 = new Node(1);
	private static Node head2 = new Node(2);
	private static Node head = null;

	public static void main(String[] args) {
		head1.AddToList(head1, 3);
		head1.AddToList(head1, 5);
		head1.AddToList(head1, 7);
		head1.AddToList(head1, 9);
		head1.AddToList(head1, 11);
		head1.AddToList(head1, 13);
		head2.AddToList(head2, 4);
		head2.AddToList(head2, 6);
		head2.AddToList(head2, 8);
		head2.AddToList(head2, 10);
		head2.AddToList(head2, 12);
		head2.AddToList(head2, 14);
		MergeLists(head1, head2);
		Node.PrintList(head);

	}

	private static void MergeLists(Node node1, Node node2) {
		if (node1 == null & node2 == null)
			return;
		else if (node1 == null) {
			getRestList(head, node2);
		} else if (node2 == null) {
			getRestList(head, node1);
		}
		while (node1 != null && node2 != null) {
			if (node1.getValue() < node2.getValue()) {
				if (head == null) {
					head = new Node(node1.getValue());
				} else {
					head.AddToList(head, node1.getValue());
				}
				node1 = node1.getNext();
			} else if (node1.getValue() > node2.getValue()) {
				if (head == null) {
					head = new Node(node2.getValue());
				} else {
					head.AddToList(head, node2.getValue());
				}
				node2 = node2.getNext();
			} else {
				head.AddToList(head, node1.getValue());
				head.AddToList(head, node2.getValue());
				node1 = node1.getNext();
				node2 = node2.getNext();
			}

		}
		if (node1 == null & node2 == null)
			return;
		else if (node1 == null) {
			getRestList(head, node2);
		} else if (node2 == null) {
			getRestList(head, node1);
		}
	}

	private static void getRestList(Node targetList, Node sourceList) {
		while (sourceList != null) {
			targetList.AddToList(targetList, sourceList.getValue());
			sourceList = sourceList.getNext();
		}
	}
}
