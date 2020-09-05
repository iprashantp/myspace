package generics;

import java.util.ArrayList;

public class AddGenericList {
	public static void main(String args[]) {
//		GenericUtility<Integer> obj=new GenericUtility<Integer>();
//		ArrayList<Integer> ilist = new ArrayList<>();
//		ilist.add(1);
//		ilist.add(2);
//		ilist.add(1);
//		ilist.add(4);
//		ilist.add(2);
//		ilist.add(1);
//		ilist.add(3);
//		ilist.add(4);
//		ilist.add(1);
//		ilist.add(5);
//		ilist.add(5);
//		GenericUtility<String> obj=new GenericUtility<String>();
//		ArrayList<String> ilist = new ArrayList<>();
//		ilist.add("hi");
//		ilist.add("how");
//		ilist.add("are");
//		ilist.add("you");
//		ilist.add("hi");
//		ilist.add("how");
//		ilist.add("how");
//		ilist.add("are");
//		ilist.add("you");
//		ilist.add("are");
//		ilist.add("hi");
//		ilist = obj.removeDuplicates(ilist);
//		for(String a: ilist) {
//			System.out.println(a);
//		}
		GenericUtility<Employee> obj=new GenericUtility<Employee>();
		ArrayList<Employee> ilist = new ArrayList<>();
		ilist.add(new Employee(1, "prashant"));
		ilist.add(new Employee(2, "nimish"));
		ilist.add(new Employee(3, "prashant"));
		ilist.add(new Employee(1, "nimish"));
		ilist.add(new Employee(2, "mona"));
		ilist.add(new Employee(3, "mona"));
		ilist.add(new Employee(3, "mona"));
		ilist.add(new Employee(2, "prashant"));
		ilist.add(new Employee(2, "prashant"));
		
		ilist = obj.removeDuplicates(ilist);
		for(Employee a: ilist) {
			System.out.println(a.getName());
		}
	}

}

class GenericUtility<T>{
	public ArrayList<T> removeDuplicates(ArrayList<T> list){
		ArrayList<T> newList = new ArrayList<>();
		for(T element:list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}
}

class Employee{
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}