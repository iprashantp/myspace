package linkedlist;

public class SortedListIntersection {
	private static Node head1 = new Node(1);
	private static Node head2 = new Node(2);

	public static void main(String[] args) {
		head1.AddToList(head1, 3);
		head1.AddToList(head1, 5);
		head1.AddToList(head1, 6);
		head1.AddToList(head1, 8);

		head2.AddToList(head2, 3);
		head2.AddToList(head2, 5);
		head2.AddToList(head2, 7);
		head2.AddToList(head2, 8);

		Node head = GetSortedListIntersection(head1, head2);

		System.out.print("List 1:\t");
		Node.PrintList(head1);
		System.out.print("\nList 2:\t");
		Node.PrintList(head2);
		System.out.print("\nIntersection:\t");
		Node.PrintList(head);

	}

	private static Node GetSortedListIntersection(Node node1, Node node2) {
		Node list1 = node1;
		Node list2 = node2;
		Node list = null;
		Node current = null;
		int value1 = 0;
		int value2 = 0;
		while (list1 != null && list2 != null) {
			value1 = list1.getValue();
			value2 = list2.getValue();

			if (value1 < value2) {
				list1 = list1.getNext();
			} else if (value1 > value2) {
				list2 = list2.getNext();
			} else {
				if (current == null) {
					Node newnode = new Node(list1.getValue());
					list = newnode;
					current = newnode;
				} else {
					Node newnode = new Node(list1.getValue());
					current.setNext(newnode);
					current = current.getNext();
				}
				list1 = list1.getNext();
				list2 = list2.getNext();
			}
		}
		current.setNext(null);

		return list;
	}
}
