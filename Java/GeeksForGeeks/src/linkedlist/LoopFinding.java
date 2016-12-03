package linkedlist;

public class LoopFinding {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		Node loopPoint = new Node();
		loopPoint.setValue(5);
		head.AddNodeToList(head, loopPoint);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		head.AddToList(head, 8);
		
		Node listEnd = new Node();
		listEnd.setValue(9);
		listEnd.setNext(loopPoint);
		head.AddNodeToList(head, listEnd);
		// head.PrintList(head);
		isCyclePresent();
	}

	private static void isCyclePresent() {
		if (head == null) {
			System.out.println("empty list");
			return;
		}
		boolean cyclePresent = false;
		Node slow = head;
		Node fast = head;
		int meetPoint = 0;
		while (fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if (fast == null) {
				break;
			}
			if (slow == fast) {
				meetPoint++;
				if (meetPoint == 2) {
					cyclePresent = true;
					break;
				}
			}
		}
		if (cyclePresent == true)
			System.out.println("cycle present at node value: "+fast.getValue());
		else
			System.out.println("cycle not present");
		return;
	}

}
