//sorting

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionsEg {
	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add("KCL");
		list.add("Dell");
		Collections.sort(list);
		System.out.println(list);
	}
}
