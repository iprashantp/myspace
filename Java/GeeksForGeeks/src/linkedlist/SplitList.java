package linkedlist;

public class SplitList {
	private static Node head = new Node(0);
	private static Node head1 = null;
	private static Node head2 = null;

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		head.AddToList(head, 8);
		splitList2(head);
		Node.PrintList(head);
		System.out.println();
		Node.PrintList(head1);
		System.out.println();
		Node.PrintList(head2);

	}
	/**
	 * This method will not create any extra list
	 * it will split original list into two
	 * @param list
	 */
	private static void splitList2(Node list){
		if (list == null) {
			System.out.println("empty list");
			return;
		}
		head1=head;
		head=head.getNext();
		head2=head;
		Node list1=head1,list2=head2;
		while(head!=null){
			list1.setNext(head);
			list1=list1.getNext();
			head=head.getNext();
			if(head==null) break;
			list2.setNext(head);
			list2=list2.getNext();
			head=head.getNext();
		}
		
	}
/**
 * this method will not affect the original list and
 * create 2 new lists
 * @param list
 */
	private static void splitList(Node list) {
		if (list == null) {
			System.out.println("empty list");
			return;
		}
		Node list1 = null;
		Node list2 = null;
		head1 = new Node(list.getValue());
		list = list.getNext();
		if (list != null) {
			head2 = new Node(list.getValue());
		} else {
			System.out.println("no element for list2");
			return;
		}

		list = list.getNext();
		list1 = head1;
		list2 = head2;
		while (list != null) {
			list1.setNext(new Node(list.getValue()));
			list1 = list1.getNext();
			list = list.getNext();
			if (list == null)
				break;
			list2.setNext(new Node(list.getValue()));
			list2 = list2.getNext();
			list = list.getNext();
		}
		return;
	}

}
