package trie;

public class TrieNode {
	public boolean isEnd;
	public TrieNode[] series;
	
	TrieNode(){
		this.isEnd=false;
		this.series = new TrieNode[26];
	}

	public static void insert(String word, TrieNode tnode) {
		int len = word.length();
		char[] wordArr = word.toCharArray();
		char c;
		for (int i = 0; i < len; i++) {
			c = wordArr[i];
			if (tnode.series[c - 97] != null) {
				if (i == len - 1)
					tnode.isEnd = true;
			} else {
				TrieNode newTrie = new TrieNode();
				tnode.series[c - 97] = newTrie;
				tnode.isEnd = (i == len - 1) ? true : false;
			}
			tnode = tnode.series[c - 97];
		}
	}

	public static boolean search(String word, TrieNode tnode) {
		char[] wordArr = word.toCharArray();
		boolean isFound=false;
		int len = word.length();
		char c;
		for (int i = 0; i < len; i++) {
			c = wordArr[i];
			// character present
			if (tnode.series[c-97] != null) {
				isFound=tnode.isEnd;
				tnode = tnode.series[c-97];
			}
			// character not present
			else{
				isFound=false;
				break;
			}
		}
		return isFound;
	}
	// reccurse until last character and keep deleting until branching occur
	public static void delete(String word,TrieNode tnode){
		char[]wordArr=word.toCharArray();
		delete(wordArr,tnode,0);
	}
	public static boolean delete(char[] word, TrieNode tnode,int index){
		boolean branchAhead=false,anEnd=false;
		//branch is ahead(word shouldnt be deleted) condition
		if(index==word.length && tnode.series[word[index]-97]!=null)
			return true;
		if(tnode.series[word[index]-97]!=null){
			branchAhead=delete(word,tnode,index+1);
			if(tnode.isEnd==true)
				anEnd=true;
		}
		//condition that current character cant be deleted
		if(branchAhead==true || anEnd==true)
			return true;
		//no branch ahead. hence this character can be deleted
		tnode.series[word[index]-97]=null;
		return false;
	}
}
