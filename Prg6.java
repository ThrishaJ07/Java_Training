public class Prg6 {
    String id,desc;
    int qty;
    double unitPrice;

    Prg6(String id, String desc, int qty, double unitPrice)
    {
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    String getID()
    {
        return id;
    }
    String getDesc()
    {
        return desc;
    }
    int getQty()
    {
        return qty;
    }
    double getUnitPrice()
    {
        return unitPrice;
    }
    double getTotal()
    {
        return unitPrice*qty;
    }
    void setQty(int qty)
    {
        this.qty=qty;
    }
    void setUnitprice(double unitPrice)
    {
        this.unitPrice=unitPrice;
    }
    public String toString()
    {
        return "InvoiceItem["+id+" "+desc+" "+qty+" "+unitPrice+"]";
    }
    public static void main(String[] args)
    {
        Prg6 obj= new Prg6("A101","Pen Red", 888,0.08);
        System.out.println(obj);
        obj.setQty(999);
        obj.setUnitprice(0.999);
        System.out.println(obj);
        System.out.println("ID:"+obj.getID());
        System.out.println("DESC:"+obj.getDesc());
        System.out.println("QTY:"+obj.getQty());
        System.out.println("UnitPrice:"+obj.getUnitPrice());
        System.out.println("Total:"+obj.getTotal());
        

    }
    
}
