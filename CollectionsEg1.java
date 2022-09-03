
//Min Max 

import java.util.*;
public class CollectionsEg1 {
		public static void main(String[] args) {
			List<Integer> list=new ArrayList<Integer>();
			list.add(49);
				list.add(56);
					list.add(30);
						list.add(90);
							list.add(15);
								list.add(35);
		
			System.out.println("Minimum "+Collections.min(list));
				System.out.println("Maximum "+Collections.max(list));
		}
	}

