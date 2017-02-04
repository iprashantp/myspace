package hashtable;

public class Main {

	public static void main(String[] args) {
		HashTable ht = new HashTable(10);
		ht.insert(2116, 5);
		ht.insert(1010, 400);
		ht.insert(200, 20);
		ht.insert(99, 71110);
		ht.insert(99, 71111);
		ht.insert(21161, 5);
		ht.insert(10142, 400);
		ht.insert(203, 20);
		ht.insert(924, 71110);
		ht.insert(915, 71111);
		ht.insert(9198, 71111);
		ht.htSearch(200);
		ht.htSearch(9198);
		ht.delete(9198);
		ht.insert(9198, 71111);
		ht.insert(9198, 71112);
		ht.htSearch(9198);
		ht.htSearch(77);
	}

}
