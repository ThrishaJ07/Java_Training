import java.io.*;
public class FileRead {
	public static void main(String[] args) throws IOException
	{
		File file = new File("Hello.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write("This\n is\n an\n example\n");
		writer.flush();
		writer.close();
		FileReader fr= new FileReader(file);
		char [] a= new char[50];
		fr.read(a);
		for(char c:a)
			System.out.print(c);
			fr.close();
	}
}
