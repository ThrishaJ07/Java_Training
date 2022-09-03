import java.util.*;
public class Array {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,sum=0,flag=0;
		n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		if((sum%2==0) && (sum%3==0) && (sum%5==0))
		{
			flag=1;
		}
		if(flag==1)
		{
			System.out.print("1");
		}
		else
		{
			System.out.print("0");
		}
	}
}
