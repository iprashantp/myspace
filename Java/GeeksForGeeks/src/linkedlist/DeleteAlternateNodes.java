package linkedlist;

public class DeleteAlternateNodes {
	private static Node head = new Node(0);

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head = deleteAltNode(head);
		Node.PrintList(head);
	}

	private static Node deleteAltNode(Node node) {
		if (node == null)
			return node;
		Node retNode=node;
		while (node != null && node.getNext() != null) {
			node.setNext(node.getNext().getNext());
			node=node.getNext();
		}
		return retNode;
	}

}
