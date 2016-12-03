package linkedlist;

public class ListIntersection {
	private static Node list1 = new Node();
	private static Node list2 = new Node();

	public static void main(String[] args) {
		list1.AddToList(list1, 1);
		list1.AddToList(list1, 2);
		list1.AddToList(list1, 3);
		list1.AddToList(list1, 4);
		Node intersectionNode = new Node(5);
		list1.AddNodeToList(list1, intersectionNode);
		list1.AddToList(list1, 6);
		list1.AddToList(list1, 7);

		list2.AddToList(list2, 10);
		list2.AddToList(list2, 11);
		list2.AddNodeToList(list2, intersectionNode);

		Node intersection = FindIntersection(list1, list2);
		if (intersection != null)
			System.out.println("intersection node: " + intersection.getValue());

	}

	private static Node FindIntersection(Node list1, Node list2) {
		Node intersectionNode = null;
		if (list1 == null || list2 == null) {
			System.out.println("no list can be null");
			return intersectionNode;
		}
		int lengthDiff = 0;
		int length1 = getListLength(list1);
		int length2 = getListLength(list2);

		Node blist = null;
		Node slist = null;
		if (length1 > length2) {
			lengthDiff = length1 - length2;
			blist = list1;
			slist = list2;
		} else {
			lengthDiff = length2 - length1;
			blist = list2;
			slist = list1;
		}
		while (lengthDiff-- > 0) {
			blist = blist.getNext();
		}
		while (blist != slist) {
			blist = blist.getNext();
			slist = slist.getNext();
		}
		intersectionNode = slist;
		return intersectionNode;
	}

	private static int getListLength(Node list) {
		int length = 0;
		Node listIter = list;
		while (listIter != null) {
			length++;
			listIter = listIter.getNext();
		}
		return length;
	}

}
