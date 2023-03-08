package jdbc_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// establish connection
		String url = "jdbc:mysql://localhost:3306/wsjdbc";
		Connection con = DriverManager.getConnection(url,"root","792002");
		// Create statement object and execute query
		Statement statement = con.createStatement();
		// Execute the query and process the resultset
		String Insertquery = "insert into student (sname,sage) values ('hardik',38)";
		int rowaffected = statement.executeUpdate(Insertquery);
		System.out.println("No of affected rows "+rowaffected);
		
		statement.close();
		con.close();
	}
}
