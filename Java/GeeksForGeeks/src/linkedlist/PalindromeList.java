package linkedlist;

public class PalindromeList {

	private static Node head = new Node();
	private static final String IS_NOT_PALINDROME = "linked list is not palindrome";
	private static final String IS_PALINDROME = "linked list is palindrome";

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 3);
		head.AddToList(head, 2);
		head.AddToList(head, 1);
		head.AddToList(head, 0);

		CheckPalindromeList();
		return;
	}

	private static void CheckPalindromeList() {
		int positionCounter = 0;
		Node fast = head;
		Node slow = head;
		Boolean compareStatus = Boolean.FALSE;
		String isPalindrome = IS_NOT_PALINDROME;

		while (fast != null && fast.getNext() != null) {
			if (fast.getNext().getNext() == null) {
				positionCounter++;
				break;
			}

			fast = fast.getNext().getNext();
			slow = slow.getNext();
			positionCounter++;
		}

		System.out.println("mid node: " + slow.getValue());
		Node reverseHead = ReverseList(slow.getNext());
		Node fhead = head;
		compareStatus = Compare(fhead, reverseHead, positionCounter);
		if (compareStatus == Boolean.TRUE) {
			isPalindrome = IS_PALINDROME;
		}
		System.out.println(isPalindrome);
		ReverseList(reverseHead);
		return;
	}

	private static Boolean Compare(Node fhead, Node rhead, int nodeCount) {
		Boolean compareStatus = Boolean.FALSE;
		while (nodeCount > 0) {

			if (fhead.getValue() == rhead.getValue()) {
				nodeCount--;
			} else {
				break;
			}
			fhead = fhead.getNext();
			rhead = rhead.getNext();
		}
		if (nodeCount == 0)
			compareStatus = Boolean.TRUE;

		return compareStatus;
	}

	private static Node ReverseList(Node slow) {
		Node rhead = slow;
		if (rhead == null)
			return null;
		Node next = rhead.getNext();
		Node current = rhead;
		Node prev = null;
		while (next != null) {
			current.setNext(prev);
			prev = current;
			current = next;
			next = next.getNext();
		}
		current.setNext(prev);
		rhead = current;
		return rhead;
	}

}
