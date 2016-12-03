package linkedlist;

public class LastNodeToFirst {
	private static Node head = new Node();

	public static void main(String[] args) {
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		
		shiftLastNodeToFirst(head);
		Node.PrintList(head);

	}
	private static void shiftLastNodeToFirst(Node node){
		if(node==null || node.getNext()==null) return;
		Node prev= null;
		Node next = node;
		while(next.getNext()!=null){
			prev=next;
			next=next.getNext();
		}
		prev.setNext(null);
		next.setNext(head);
		head=next;
		return;
	}

}
