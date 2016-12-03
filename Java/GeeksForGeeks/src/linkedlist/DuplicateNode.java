package linkedlist;

public class DuplicateNode {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 1);
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 2);
		head.AddToList(head, 3);

		head = RemoveDuplicates(head);
		Node.PrintList(head);
	}

	private static Node RemoveDuplicates(Node node) {
		if (node == null) {
			System.out.println("empty list");
			return node;
		}
		Node currentNode = node;
		//Node previous = null;
		Node listIter = node;
		while (listIter != null) {
			if (currentNode.getValue() != listIter.getValue()) {
				currentNode.setNext(listIter);
				currentNode = listIter;
			}
			listIter = listIter.getNext();
		}
		currentNode.setNext(null);
		return node;
	}

}
