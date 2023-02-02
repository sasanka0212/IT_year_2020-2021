import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create
{
	public static void main(String args[]) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	//create connection
			Statement statement=connection.createStatement();			//statement creation
			statement.executeUpdate("create table student10"
					+ "(sid number(3) primary key,"
					+ "sname varchar2(20),"
					+ "roll number(3),"
					+ "stream varchar2(15))");
			statement.close();
			connection.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
