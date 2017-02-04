package hashtable;

public class ListNode {
	private ListNode next;
	private int key;
	private int value;

	public ListNode() {
		this.next=null;
	}
	public ListNode(int key,int value) {
		this.next=null;
		this.key=key;
		this.value=value;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
