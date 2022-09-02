
import java.util.*;

public class Prg10 {
    public static void main(String[] args)
    {
        List <Integer> intList = new ArrayList< > ();
        for (int i=0;i<10;i++)
        {
            intList.add(i);
        }
        Iterator< Integer > intListIterator=intList.iterator();
        try{
            intListIterator.remove();

        }
        catch(IllegalStateException e)
        {
            System.err.println("IllegalStateException caught");
        }
        
    }
}
