
public class TestGeneric {
	public static <E> void printArray(E[] elements)
	{
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Integer[] intArray = {10,20,30,40,50};
		Character[] charArray= {'J','A','V','A','T','R','A','I','N','G'};
		System.out.println("Printing Integer array");
		printArray (intArray);
		System.out.println("Printing Character Array");
		printArray(charArray);
	}
}
