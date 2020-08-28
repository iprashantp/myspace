
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Altimetrik {

	public static void main(String[] args) {
 		// TODO Auto-generated method stub
		
		Altimetrik obj = new Altimetrik();
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(1);
		list.add(15);
		list.add(6);
		list.add(9);
		list.add(0);
		list.add(51);
		list = sort(list);
		ListIterator<Integer> li = list.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}
	public static List<Integer> sort(List<Integer> toSortArray) {
		qsort(toSortArray, 0, toSortArray.size()-1);
		return toSortArray;
    }
	public static void qsort(List<Integer> list, int left, int right) {
	    int q;
	    if (right > left) {
	        q = partition(list, left, right);
	        qsort(list, left, q - 1);
	        qsort(list, q + 1, right);
	    }
	}
	
	static int partition(List<Integer> list, int l, int r) {
	    int piv = list.get(l);
	    int i = l;
	    int j = r + 1;
	    while(true) {
	        while (list.get(++i) < piv)
	            if (i >= r)
	                break;
	        // Now, list[i]≥P
	        while (list.get(--j) > piv)
	            if (j <= l)
	                break;
	        // Now, list[j]≤P
	        if (i >= j)
	            break; // break the for-loop
	        else
	            // swap(list[i],list[j]);
	            Collections.swap(list, i, j);
	    }
	    if (j == l)
	        return j;
	    // swap (list[left],list[j]);
	    Collections.swap(list, l, j);
	    return j;
	}
	
}
