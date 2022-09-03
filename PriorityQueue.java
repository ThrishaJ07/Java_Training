import java.util.*;
public class PriorityQueue {
		public static void main(String args[])
		{
			//vectorexample
			Vector v1=new Vector();
			Vector v2=new Vector(20);
			Vector v3=new Vector(30,10);
			 v2.add(100);
			 v2.add(200);
			 v2.add(300);
			 Vector v4 = new Vector(v2);
			 
			 System.out.println("v1" +  v1.capacity());
			 System.out.println("v2" + v2.capacity());
			 System.out.println("v3" + v3.capacity());
			 System.out.println("v1" + v4.capacity());
			
		}
}


