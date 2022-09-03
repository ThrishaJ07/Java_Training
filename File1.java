import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) throws IOException
	{
		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader("C:\\Users\\Hp\\eclipse-workspace\\Javatrain\\input.txt");
			out = new FileWriter("C:\\Users\\Hp\\eclipse-workspace\\Javatrain\\output.txt");
			int c;
			while((c = in.read())!=-1)
			{
				out.write(c);

			}
		}
		finally {
			if(in !=null)
			{
				in.close();
			}
			if(out !=null)
			{
				out.close();
			}
		}
		System.out.println("success");
	}
}
