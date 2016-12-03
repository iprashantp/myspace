package linkedlist;

public class DeleteNode {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		head.AddToList(head, 8);

		deleteNode(1);
		printList();

	}

	private static void deleteNode(int value) {
		Node listIter = head;
		Node prev = null;
		while (listIter != null) {
			if (listIter.getValue() == value) {
				if (prev == null) {
					head = head.getNext();
					break;
				}
				prev.setNext(listIter.getNext());
				break;
			}
			prev = listIter;
			listIter = listIter.getNext();
		}
	}

	/**
	 * print Linded List
	 */
	private static void printList() {
		while (head != null) {
			System.out.print(head.getValue());
			head = head.getNext();
			if (head != null) {
				System.out.print("-->");
			}
		}
	}

}
