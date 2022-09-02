import java.util.*;

public class Prg3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the value of L and M array");
        String a = sc.nextLine();
        String[] array=a.split(" ");
        int b[] = new int[array.length];
        b[0]=Integer.valueOf(array[0]);
        b[1]=Integer.valueOf(array[1]);
        
        // for(int i=0;i<array.length;i++)
        // {
        //     b[i]=Integer.valueOf(array[i]);
           
        // }
        if(n>b[0] && n<b[1])
        {
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}
