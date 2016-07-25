import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class testselect {

	public static void main(String[] args) throws Exception {
		Connection connection;
		Statement statement;

		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/yyq", "thinkpad", "");
		statement = connection.createStatement();

		long a = System.currentTimeMillis();
		// This is used for test JOIN select with index on pname
		String sql1 = String.format("select pname,cname from people100 join city where pname='Mary'"+ "");
		// String sql1 =String.format("select pname,cname from people1000000 join city where cid=1"+"");
		
		// This is used for test select on one single table
//		 String sql1 = String.format("select * from people1000000"+"");
		
		// This is used for test select on index on pname
		// String sql1 =
		// String.format("select * from people1000000 where pname='John'"+"");
		// String sql1 =
		// String.format("select * from people1000000 where cid=8"+"");

		statement.execute(sql1);
		long b = System.currentTimeMillis();
		System.out.println("selection takes" + (b - a) + " ms");

		statement.close();
		connection.close();
	}
}