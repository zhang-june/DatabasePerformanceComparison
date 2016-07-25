import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class testinsert {

    public static void main(String[] args) throws Exception {
        Connection connection;
        Statement statement;

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yyq", "thinkpad", "");
        statement = connection.createStatement();

        // «Â¿Ì±Ì
        statement.executeUpdate("truncate table people"); 
        long a=System.currentTimeMillis();  

        for (int x = 0; x < 100; x++) {
            int I;
            
        	I=x*10+1;  
             String sql1 = String.format("insert into people(ID,pname,cid)"+
             "values(%d,'Mary',6)",I);
             statement.executeUpdate(sql1);
             
            I=x*10+2;
            String sql2 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Ann',5)",I);
            statement.executeUpdate(sql2);
            
            I=x*10+3;    
            String sql3 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Bob',8)",I);
            statement.executeUpdate(sql3);
            
            I=x*10+4;       
            String sql4 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Rachel',4)",I);
            statement.executeUpdate(sql4);
            
            I=x*10+5;        
            String sql5 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Helen',3)",I);
            statement.executeUpdate(sql5);
            
            I=x*10+6; 
            String sql6 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Steven',2)",I);
            statement.executeUpdate(sql6);
            
            I=x*10+7;
            String sql7 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Carrie',1)",I);
            statement.executeUpdate(sql7);
            
            I=x*10+8;
            String sql8 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'John',8)",I);
            statement.executeUpdate(sql8);
            
            I=x*10+9;
            String sql9 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Jim',4)",I);
            statement.executeUpdate(sql9);
            
            I=x*10+10;
            String sql10 = String.format("insert into people(ID,pname,cid)"+
            "values(%d,'Zach',7)",I);
            statement.executeUpdate(sql10);
 
        }
        
        long b=System.currentTimeMillis();  
        System.out.println("Insert takes"+ (b-a)+" ms"); 

        statement.close();
        connection.close();
    }
}