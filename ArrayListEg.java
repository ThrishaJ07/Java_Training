
//Array List and Iterator Example

import java.util.*;
public class ArrayListEg {
	public static void main(String[] args)
	{
		ArrayList li=new ArrayList();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("five");
		li.add(1.2);
		li.add(10.2);
		li.add(18.3);
		System.out.println(li);
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		
		}
		li.remove(10.2);
		//ListIterator
		
		System.out.println("Using Iterator");
		ListIterator litr=li.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("Using ListIterator Previous");
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
}
