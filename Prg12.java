
class Person{
    public String personName;
    public String getPersonName(){
        return personName;
    }
    public void setPersonName(String personName)
    {
        this.personName = personName;
    }
}
public class Prg12 {
    public static void main(String[] args)
    {
        Person personObj = null;
        try{
            String name = personObj.personName;
            personObj.personName="Ramesh Fadatare";
        }
        catch(NullPointerException e)
        {
            System.err.println( "NullPointerException caught");
            e.printStackTrace();
        }
    }
}
