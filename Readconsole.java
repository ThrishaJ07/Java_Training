import java.io.*;
public class Readconsole {
	public static void main(String[] args) throws IOException
	{
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader(System.in);
			System.out.println("Press Enter to quit");
			char c;
			do {
				c = (char) cin.read();
				System.out.print(c);
			}while(c!='\n');
		}
		finally
		{
			if(cin!=null)
			{
				cin.close();
			}
		}
	}
}
