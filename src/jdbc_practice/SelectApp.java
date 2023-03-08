package jdbc_practice;
import java.sql.*;
public class SelectApp {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/wsjdbc";
		Connection con = DriverManager.getConnection(url,"root","792002");
		Statement statement = con.createStatement();
		ResultSet resultset = statement.executeQuery("select sid,sname,sage from student");
		while(resultset.next()) {
			Integer sid = resultset.getInt(1);
			String sname = resultset.getString(2);
			Integer sage = resultset.getInt(3);
			System.out.println(sid+"\t"+sname+"\t"+sage);
		}
		resultset.close();
		statement.close();
		con.close();
	}

}
