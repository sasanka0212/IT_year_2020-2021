import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update
{
	public static void main(String args[]) {
		try
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	//create connection
			Statement statement=connection.createStatement();	//statement
			int i = 5;
			while(i-->0) {
				String query = "insert into student10 alues(:sid,:sname,:roll,:stream)";
				int r = statement.executeUpdate(query);
				System.out.print(r + "'s rows inserted");
			}
		}
		catch(Exception ep) {
			System.out.print(ep);
		}
	}
}
