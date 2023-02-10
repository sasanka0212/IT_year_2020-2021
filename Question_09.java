import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Question_09
{
	public static void main(String args[]) {
		try 
		{
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sasa", "root", "2002");
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	
			CallableStatement cst = connection.prepareCall("select count(*) from student");
			ResultSet rs = cst.executeQuery();
			while(rs.next()) {
				System.out.print("number of rows : " + rs.getInt(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
