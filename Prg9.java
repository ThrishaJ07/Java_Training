
public class Prg9 {
    public static void main(String[] args)
    {
        try{
            Class.forName("com.example.core.java.Demo");
            ClassLoader.getSystemClassLoader().loadClass("com.example.corejava.Demo");

        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Package name"+" and class file are not there");
        }
    }
}
