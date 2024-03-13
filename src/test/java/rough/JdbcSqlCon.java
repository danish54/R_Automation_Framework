package rough;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class JdbcSqlCon {

	@Test
	public void sqlmap() throws SQLException {
		
		String url = "jdbc:mysql://+host+port+database";
		
		Connection connct = DriverManager.getConnection(url, "root", "root");
		Statement stmnt = connct.createStatement();
		ResultSet result = stmnt.executeQuery("Select * from tablename");
		result.getString("columname");
	}
}
