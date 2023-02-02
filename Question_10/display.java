import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class display 
{
	public static void main(String args[]) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	//create connection
			Statement statement=connection.createStatement();			//statement
			String query = "select * from studnet10";
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				System.out.println("Student Id : " + rs.getInt(0) + " Name : " +
								    rs.getString(1) + " Roll : " + rs.getInt(2) + " Stream : " + rs.getString(3));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
