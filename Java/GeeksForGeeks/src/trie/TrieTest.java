package trie;

public class TrieTest {

	public static void main(String[] args) {
		TrieNode tnode= new TrieNode();
		TrieNode.insert("hello", tnode);
		TrieNode.insert("hell", tnode);
		TrieNode.insert("india", tnode);
		
		boolean a=TrieNode.search("hello", tnode);
		if(a==true) System.out.println("yes");
		else System.out.println("no");
		
		TrieNode.delete("hello", tnode);
		a=TrieNode.search("hell", tnode);
		if(a==true) System.out.println("yes");
		else System.out.println("no");
	}

}
