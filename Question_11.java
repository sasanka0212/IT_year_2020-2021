import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Question_11 
{
	public static void main(String args[]) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	//create connection
			Statement statement=connection.createStatement();	//statement
			String query = "delete from student10 where sid between 10 and 15";
			int del = statement.executeUpdate(query);
			System.out.print(del + " row(s) deleted.");
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
