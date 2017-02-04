package hashtable;

public class HashTable {
	private int tsize;
	private int tcount;
	private HashTableNode[] htNode;
	
	public HashTable(int tsize) {
		htNode = new HashTableNode[tsize] ;
		this.tsize = tsize;
		this.tcount = 0;
	}
	private int hash(int key){
		return key%this.tsize;
	}
	//table of hashtable nodes
	private HashTableNode getHashTableNode(int key){
		HashTableNode temp = null;
		HashTableNode htNode = null;
		int hash = this.hash(key);
		//iterate hashtable
		for(int i=0;i<this.tcount;i++){ 
			temp = this.htNode[i];
			if(temp.getHash()==hash){
				htNode = temp;
				break;
			}
		}
		return htNode;
	}
	private ListNode getList(int key){
		int hash = this.hash(key);
		HashTableNode htNode=null;
		ListNode nList = null;
		
		for(int i=0;i<this.tcount;i++){
			htNode=this.htNode[i];
			if(htNode.getHash()==hash){
				if(htNode.getNcount()>0){
					nList = htNode.getNlist();
				}
			}
		}
		return nList;
	}
	private ListNode search(int key){
		ListNode node = null;
		ListNode nList = null;
		
		nList = this.getList(key);
		if(nList!=null){
			for(ListNode temp = nList;temp!=null;temp=temp.getNext()){
				//key in the list matches with key searched
				if(temp.getKey()==key){
					node = temp;
					break;
				}
			}
		}
		return node;
	}
	//search key in hashtable
	public int htSearch(int key){
		int value = Integer.MIN_VALUE;
		ListNode node= this.search(key);
		if(node!=null){
			value = node.getValue();
		}
		
		if(value==Integer.MIN_VALUE){
			System.out.println("key "+key+" not found!!");
		}else{
			System.out.println("key "+key+" found, value= "+value);
		}
		return value;
	}
	private boolean hashSearch(int key){
		boolean retval = Boolean.FALSE;
		int hash = this.hash(key);
		HashTableNode htNode=null;
		
		for(int i=0;i<this.tcount;i++){
			htNode=this.htNode[i];
			if(htNode.getHash()==hash){
				retval=Boolean.TRUE;
				break;
			}
		}
		return retval;
	}
	
	public boolean insert(int key,int value){
		//for each insertion increase this.tcount, if tcount==tsize dont insert hashtable is full
		boolean retval = Boolean.FALSE;
		int hash = this.hash(key);
		HashTableNode htableNode=null;
		ListNode htList = null;
		ListNode temp = null;
		ListNode temp1 = null;
		
		//hash for the key exists, then insert in that list corresponding hash
		if(this.hashSearch(hash)==Boolean.TRUE){
			htableNode = this.getHashTableNode(hash);
			htList = htableNode.getNlist();
			temp = htList;
			temp1 = null;
			
			while(temp!=null){
				temp1 = temp;
				if(temp.getKey()==key){
					System.out.println("Key "+key+" already present! overriting value "+value+"!!");
					temp.setValue(value);
					retval=Boolean.TRUE;
					break;
				}
				temp = temp.getNext();
			}
			if(retval==Boolean.FALSE){
				temp1.setNext(new ListNode(key,value));
				retval=Boolean.TRUE;
			}
		}
		else{
			//
			if(this.tcount<this.tsize-1){
				for(int i=0;i<tcount;i++){}
				//create new list
				htList = new ListNode();
				htList.setKey(key);
				htList.setNext(null);
				htList.setValue(value);
				//create new hash table node
				htableNode = new HashTableNode();
				htableNode.setHash(hash);
				htableNode.setNcount(1);
				htableNode.setNlist(htList);
				//put hashtable node to array of hashtableNodes in hashtable
				this.htNode[tcount++] = htableNode; 
				
				retval=Boolean.TRUE;
			}
			else{
				System.out.println("Hash Table Full!! cant insert!!! ");
			}
			
		}
		if(retval==Boolean.TRUE){
			System.out.println("key "+key+" inserted");
		}
		return retval;
	}
	public boolean delete(int key){
		ListNode nList= this.getList(key);
		ListNode temp =null;
		boolean status = Boolean.FALSE;
		int nodeIndex=0;
		HashTableNode htableNode = null;
		HashTableNode tempTNode = null;
		int hash = this.hash(key);
		//iterate hashtable
		for(int i=0;i<this.tcount;i++){ 
			tempTNode = this.htNode[i];
			if(tempTNode.getHash()==hash){
				htableNode = tempTNode;
				nodeIndex = i;
				break;
			}
		}
		
//		HashTableNode htableNode = this.getHashTableNode(key);
		if(htableNode!=null){
			nList = htableNode.getNlist();
			if(nList!=null){
				if(nList.getKey()==key){
					htableNode.setNlist(nList.getNext());
					status = Boolean.TRUE;
				}
				else{
					while(nList.getNext()!=null){
						temp = nList;
						if(nList.getKey()==key){
							temp.setNext(nList.getNext());
							status = Boolean.TRUE;
							break;
						}
						nList = nList.getNext();
					}
					
				}
			}
			
		}
		if(status==Boolean.FALSE){
			System.out.println("Key "+key+" not found!!");
		}else{
			System.out.println("Key "+key+" deleted");
			htableNode.setNcount(htableNode.getNcount()-1);
			if(htableNode.getNlist()==null){
				this.htNode[nodeIndex] = null;
				this.tcount--;
			}
		}
		return status;
	}
	
	public int getTsize() {
		return tsize;
	}
	public void setTsize(int tsize) {
		this.tsize = tsize;
	}
	public int getTcount() {
		return tcount;
	}
	public void setTcount(int tcount) {
		this.tcount = tcount;
	}
	public HashTableNode[] getHtNode() {
		return htNode;
	}
	public void setHtNode(HashTableNode[] htNode) {
		this.htNode = htNode;
	}
}
