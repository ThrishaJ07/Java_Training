import java.util.*;
public class Prg1{
    public static void main(String[] args){
        
        int n,m,t;
        Scanner s= new Scanner(System.in);
        System.out.print("enter the n value : ");
        n=s.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
            
        }
        System.out.print("enter the m value : ");
        m=s.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++)
        {
            arr2[i]=s.nextInt();
            t=arr2[i];
            arr2[i]=arr1[i];
            arr1[i]=t;
        }
        String a1= Arrays.toString(arr1);
        String a2= Arrays.toString(arr2);

        

         s.close();
       
       
        System.out.println(a1.replace(",", "").replace("[", "").replace("]", ""));
        System.out.println( a2.replace(",", "").replace("[", "").replace("]", ""));
       
    }
}