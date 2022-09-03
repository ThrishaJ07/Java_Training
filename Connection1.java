
import java.sql.*;
public class Connection1 {
public static void main(String[] args) {
Connection con=null;
try {
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/training";
con=DriverManager.getConnection(url,"root","priya123");
System.out.println("connection successful");
}
catch(Exception e) {
e.printStackTrace();
}
}
}