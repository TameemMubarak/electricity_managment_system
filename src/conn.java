import java.sql.*;

public class conn
{
    Connection c;
    Statement s;
    public conn()
    {
        // this is inside the try block
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost/ebs","root","password");
            s=c.createStatement();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
