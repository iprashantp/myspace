package linkedlist;

public class MergeSort {
	private static Node head = new Node(5);
	private static Node resultList = null;

	public static void main(String[] args) {
		head.AddToList(head, 9);
		head.AddToList(head, 12);
		head.AddToList(head, 6);
		head.AddToList(head, 3);
		head.AddToList(head, 7);
		head.AddToList(head, 1);
		head.AddToList(head, 8);
		head.AddToList(head, 5);
		head.AddToList(head, 20);
		Sort(head);

	}

	private static void Sort(Node list) {
		int length = 0;
		while (list != null) {
			list = list.getNext();
			length++;
		}
		MergeSortList(head, 1, length);
	}

	private static void MergeSortList(Node list, int first, int last) {
		if (first < last) {
			int middle = first + (last - first) / 2;
			MergeSortList(list, first, middle);
			MergeSortList(list, middle + 1, last);
			MergeElements(list, first, middle, last);
		}
	}

	private static void MergeElements(Node list, int first, int middle, int last) {
		
	}
	private static Node getIthNode(Node list,int i){
		int j = 1;
		while(j<=i){
			list=list.getNext();
			j++;
		}
		return list;
	}

}
