
//Prg to find how much time last person to wait

import java.util.Scanner;
public class Prg16 {
    public static void main(String[] args)
    {
        int n,x,m;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        x=s.nextInt();
        m=(n-1)*x;
        System.out.println(m);
    }
}
