import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Random;

public class citytable {

    public static void main(String[] args) throws Exception {
        Connection connection;
        Statement statement;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yyq", "thinkpad", "");
        statement = connection.createStatement();

        // «Â¿Ì±Ì
        statement.executeUpdate("truncate table city");
        
        String sql1 = String.format("insert into city(ID,cname)"+"values(1,'London')");
           statement.executeUpdate(sql1);
        String sql2 = String.format("insert into city(ID,cname)"+"values(2,'Paris')");
           statement.executeUpdate(sql2);
        String sql3 = String.format("insert into city(ID,cname)"+"values(3,'New York')");
           statement.executeUpdate(sql3);
        String sql4 = String.format("insert into city(ID,cname)"+"values(4,'Boston')");
           statement.executeUpdate(sql4);
        String sql5 = String.format("insert into city(ID,cname)"+"values(5,'Beijing')");
           statement.executeUpdate(sql5);
        String sql6 = String.format("insert into city(ID,cname)"+"values(6,'Worcester')");
           statement.executeUpdate(sql6);
        String sql7 = String.format("insert into city(ID,cname)"+"values(7,'Tokyo')");
           statement.executeUpdate(sql7);
        String sql8 = String.format("insert into city(ID,cname)"+"values(8,'Rome')");
           statement.executeUpdate(sql8);


        statement.close();
        connection.close();
    }
}