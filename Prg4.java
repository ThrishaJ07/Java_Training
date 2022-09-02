import java.util.*;

public class Prg4{
    public static void main(String args[])
    {   
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine(); //
        String input =sc.nextLine();
        String[] c =input.split(" ");
        int d=sc.nextInt();
       for(int i=0;i<n;i++)
       {
            if(Integer.valueOf(c[i]) %d == 0)
            {
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
       }
        System.out.println();
        sc.close();

    }
}