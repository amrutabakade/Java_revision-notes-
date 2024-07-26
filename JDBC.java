import java.sql.*;
public class JDBC {
    public static void main(String arges[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //create connection to db
            Connection con = DriverManager.getConnection("JDBC:mysql://localhost:3306/DB", "root", "root");
            System.out.println("connected");
            //used to execute query
            Statement stmt = con.createStatement();
            //created bookstore table
            // String query = "create table BookStore(id int, name varchar(30), price int)";
            //add data to book store
            // String query = "insert into BookStore values(1,'subtleArt', 50)";
            //stmt.executeUpdate(query);
            //System.out.println("update success");
            String query = "select * from BookStore";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getInt(3));
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
//add jar file.
//first make database in mysql.
// use executeUpdate(query) to update, delete ,insert in db.
//use executeQuery(query) to read db.