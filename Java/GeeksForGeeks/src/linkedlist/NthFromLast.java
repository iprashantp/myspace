package linkedlist;

public class NthFromLast {
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

		int n = 9;
		Node result = null;
		// result = GetNthElementfromLast(n);
		result = GetNthElementfromLastReccursive(n);

		if (result != null)
			System.out.println(n + "th element from last is: "
					+ result.getValue());

	}

	private static Node GetNthElementfromLast(int n) {
		Node result = null;
		Node iter = head;
		Node itern = head;
		int counter = 1;

		if (head == null) {
			System.out.println("empty linked list");
			result = null;
		}

		else if (n <= 0) {
			System.out.println("invalid value of n");
			result = null;
		}

		else {
			while (iter.getNext() != null) {
				iter = iter.getNext();
				if (counter >= n) {
					itern = itern.getNext();
				}
				counter++;
			}
			if (counter >= n) {
				result = itern;
			} else {
				System.out.println("linked list is shorter than " + n);
				result = null;
			}
		}
		return result;
	}

	private static int nthCounter = 0;

	private static Node GetNthElementfromLastReccursive(int n) {
		return GetNthElement(head, n);
	}

	private static Node GetNthElement(Node node, int n) {
		Node currentNode = node;
		if (node == null)
			return node;
		node = GetNthElement(node.getNext(), n);
		if (++nthCounter == n) {
			return currentNode;
		}
		return node;
	}
}
