//prg to swap letter in odd position to even position
import java.util.*;
public class Prg2 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        s = sc.nextLine();
        char[] t1 = s.toCharArray();
        for(int i=0;i<s.length()-1;i=i+2)
        {
            char temp;
            temp=t1[i];
            t1[i]=t1[i+1];
            t1[i+1]=temp;
        }
        System.out.println(t1);
        //or only for even characters
            // for(int i=0;i<s.length();i=i+2)
            // {
            //  System.out.print(t1[i+1]);
            //  System.out.print(t1[i]);
            // }
        sc.close();
    }
    
}
