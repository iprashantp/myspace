package hashtable;

public class HashTableNode {
	private int ncount;
	private int hash;
	private ListNode nlist;
	
	public int getHash() {
		return hash;
	}
	public void setHash(int hash) {
		this.hash = hash;
	}
	public HashTableNode() {
		this.ncount=0;
		this.nlist=null;
	}
	public int getNcount() {
		return ncount;
	}
	public void setNcount(int ncount) {
		this.ncount = ncount;
	}
	public ListNode getNlist() {
		return nlist;
	}
	public void setNlist(ListNode nlist) {
		this.nlist = nlist;
	}
}
