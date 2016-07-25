import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class testupdate {

	public static void main(String[] args) throws Exception {
		Connection connection;
		Statement statement;

		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/yyq", "thinkpad", "");
		statement = connection.createStatement();

		long a = System.currentTimeMillis();
		// This update is used for JOIN tables
//		String sql1 = String.format("update people join city set cname='Seattle' where pname='Bob'"+ "");
		// This update is used for single table
//		String sql1 = String.format("update people set cid=6 where pname='Ann'"+ "");
		// This update is used for single table with index on pname
//		String sql1 = String.format("update people1000000 set cid=6 where pname='Ann'"+ "");
		// This update is used for join table with index on pname
		String sql1 = String.format("update people100 join city set cid=6 where pname='Ann'"+ "");
		
		statement.executeUpdate(sql1);
		long b = System.currentTimeMillis();
		System.out.println("update takes" + (b - a) + " ms");

		statement.close();
		connection.close();
	}
}