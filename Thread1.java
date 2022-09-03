
public class Thread1 implements Runnable{
	public void run()
	{
		System.out.println("Now the thread is running...");
	}
	public static void main(String[] args)
	{
		Runnable r1 = new Thread1();
		Thread t1 = new Thread(r1, "My First Thread");
		t1.start();
		String str1=t1.getName();
		System.out.println(str1);
	}
}
