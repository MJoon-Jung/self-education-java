package CollectionFrameWork.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(6);
		list1.add(5);
		list1.add(1);
		list1.add(4);
		list1.add(2);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1,list2);
		
		System.out.println(list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(1,"A");
		print(list1,list2);
		
		list2.set(1, "AA");
		print(list1,list2);
		
		System.out.println(list1.retainAll(list2));
		print(list1,list2);
		
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1  : " + list1);
		System.out.println("list2  : " + list2);
		System.out.println();
	}
}
