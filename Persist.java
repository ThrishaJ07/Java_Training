import java.io.*;

public class Persist {

                public static void main(String[] args)

                {

                                try {

                                				Student1 s1=new Student1(211,"ravi");

                                                FileOutputStream fout=new  FileOutputStream("f.txt");

                                                ObjectOutputStream out=new ObjectOutputStream(fout);

                                                out.writeObject(s1);

                                                out.flush();

                                                out.close();

                                                System.out.println("suceess");

                                }catch(Exception e) {

                                                System.out.println(e);

                                }

                }

}