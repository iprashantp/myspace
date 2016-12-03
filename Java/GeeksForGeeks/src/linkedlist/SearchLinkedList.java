package linkedlist;

public class SearchLinkedList {
	private static Node head = new Node();

	public static void main(String[] args) {
		int searchResult = -1;
		int n;
		head.AddToList(head, 1);
		head.AddToList(head, 2);
		head.AddToList(head, 3);
		head.AddToList(head, 4);
		head.AddToList(head, 5);
		head.AddToList(head, 6);
		head.AddToList(head, 7);
		head.AddToList(head, 8);

		n = 8;

		 //searchResult = searchIterative(n);
		searchResult = searchReccursive(n);
		if (searchResult<0)
			System.out.println("element " + n + " not found");
		else
			System.out.println("element " + n + " found at "+searchResult+"'th location");
	}

	private static int searchIterative(int value) {
		int searchStatus = -1;
		Node listIter = head;
		int counter = 0;
		while (listIter != null) {
			counter++;
			if (listIter.getValue() == value) {
				searchStatus = counter;
				break;
			}
			listIter = listIter.getNext();
		}
		return searchStatus;
	}

	private static int searchReccursive(int value) {
		return reccursiveSearch(value, head);
	}

	private static int reccursiveSearch(int value, Node head) {
		int searchStatus = 0;
		if (head == null)
			searchStatus = -1;
		
		else if (head.getValue() == value) {
			searchStatus = 1;
		} 
		else {
			searchStatus = reccursiveSearch(value, head.getNext());
			if(searchStatus>0){
				searchStatus += 1;
			}
			
		}
		return searchStatus;
	}

}
