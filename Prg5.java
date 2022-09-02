//Constructor

public class Prg5 {
    int id,salary,annualsalary,percent,incsalary;
    String firstname;
    String lastname;
    
    Prg5(int id, String firstname, String lastname,int salary)
    {
        this.id=id;
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }
    int getID()
    {
        return id;
    }
    String getFirstNane()
    {
        return firstname;
    }
    String getLastName()
    {
        return lastname;
    }
    String getName()
    {
        return firstname+lastname;
    }
    int getSalary()
    {
        return salary;
    }
    void setSalary(int salary)
    {
        this.salary=salary;
         annualsalary=salary*12;
    }
    int getAnnualSalary()
    {

        return annualsalary;
    }
    int raiseSalary(int percent)
    {
        incsalary=annualsalary*(percent+100)/100;
        salary=incsalary/12;
        return incsalary;
    }
    public String toString(){
        return id+" "+firstname+" "+lastname+" "+salary;
    }
    public static void main(String[] args)
    {
        Prg5 obj=new Prg5(172,"thrisha","j",20000);
        System.out.println(obj.getID());
        System.out.println(obj.getFirstNane());
        System.out.println(obj.getLastName());
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());
        obj.setSalary(10000);
        System.out.println(obj.getAnnualSalary());
        System.out.println(obj.raiseSalary(20));
        System.out.println(obj.toString());

    }
}
