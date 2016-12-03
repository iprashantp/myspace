package linkedlist;

public class GetNthNode {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		int n = 9;
		getNthValue(n);

	}

	public static void getNthValue(int n) {
		int nthValue = -1;
		if (n <= 0) {
			System.out.println("n should be positive integral value");
		} else {
			Node nthNode = getNthNode(n);
			if (nthNode != null) {
				nthValue = nthNode.getValue();
				System.out.println("nth value is :" + nthValue);
			}
		}
		return ;
	}

	private static Node getNthNode(int n) {
		Node node = null;
		if (head == null) {
			System.out.println("empty linked list");
		} else {
			Node listIter = head;
			int i = 0;
			while (++i < n && listIter != null) {
				listIter = listIter.getNext();
			}
			if (listIter != null) {
				node = listIter;

			} else {
				System.out.println(n + "th node doesnt exist");
			}
		}
		return node;
	}

}
