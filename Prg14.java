
//gcd prg

import java.util.*;
public class Prg14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int lcm=1;
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int gcd=1;
        int min=Math.min(num1,num2);
        for(int i=1;i<=min;i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd=i;
        }
        lcm=(num1*num2)/gcd;
        System.out.println("GCD between "+num1+" and "+num2+" is "+gcd);
        System.out.println("LCM between "+num1+" and "+num2+" is "+lcm);
    }
}
