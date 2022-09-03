
public class TestDemoThread1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("demon thread work");
		}
		else
		{
			System.out.println("user thread work");
		}
	}
	public static void main(String[] args)
	{
		TestDemoThread1 t1=new TestDemoThread1();
		TestDemoThread1 t2=new TestDemoThread1();
		TestDemoThread1 t3=new TestDemoThread1();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
