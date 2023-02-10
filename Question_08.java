import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Question_08 
{
	public static void main(String args[]) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());	//driver register
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","sasa");	//create connection
			Statement statement=connection.createStatement();
			String studentQuery = "create table student(id number primary key, sname varchar2(20), marks number)";
			String teacherQuery = "create table teacher(tname varchar2(25), dept varchar2(20))";
			
			statement.executeUpdate(studentQuery);
			statement.executeUpdate(teacherQuery);
			
			System.out.print("Inserting 2 student table values : ");
			System.out.println(statement.executeUpdate("insert into student values(11,'sasanka kundu',95)"));
			System.out.println(statement.executeUpdate("insert into student values(3, 'ayush sharma', 90)"));
			
			System.out.print("Inserting 2 teacher table values : ");
			System.out.println(statement.executeUpdate("insert into teacher values('sam','physics')"));
			System.out.println(statement.executeUpdate("insert into teacher values('rita', 'math')"));
			
			statement.executeUpdate("update teacher set tname='Dr. rita' where tname='rita'");
			
			String updateTeacher = "update teacher set tname=concat('Dr.', tname)";
			PreparedStatement ps = connection.prepareStatement(updateTeacher);
			ps.executeUpdate();
			
			statement.executeUpdate("delete from student where id=3");
			
			ResultSet rs = statement.executeQuery("select * from student where sname='ayush'");
			rs.moveToInsertRow();
			rs.updateInt("id", 3);
			rs.updateString("sname", "ayush");
			rs.updateInt("marks", 88);
			rs.insertRow();
			rs.moveToInsertRow();
			rs.updateInt("id", 5);
			rs.updateString("sname", "ayush");
			rs.updateInt("marks", 50);
			rs.insertRow();
			/*while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("sname") + " " + rs.getString("marks"));
			}*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
