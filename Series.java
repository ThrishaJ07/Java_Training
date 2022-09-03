import java.util.*;
public class Series {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,out;
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			out=(i*i)+1;
			System.out.print(out+" ");
		}
	}
}
