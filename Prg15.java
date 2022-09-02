
//Program to find minimum and maximum number index in an array

import java.util.Scanner;
public class Prg15 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String str=s.nextLine();
        String arr[]=str.split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.valueOf(arr[i]);
        }
        int max=0;
        int min=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[min]>a[i])
                min=i;
            else if(a[i]>a[max])
                max=i;
        }
        System.out.println("Min index "+min+1);
        System.out.println("Max index "+max+1);


    }
}
