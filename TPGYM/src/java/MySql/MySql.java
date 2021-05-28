package MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySql {
    private Connection conn;
    private PreparedStatement ps;
    public MySql(String db) 
            throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/datis", "root", "root"
        );
    } 
    
    public void exQuery(String n, String c, String m) throws SQLException{
        ps = conn.prepareStatement("insert into dati(nome, cogn, mail) values(?, ?, ?);");
        ps.setString(1, n);
        ps.setString(2, c);
        ps.setString(3, m);
        ps.executeUpdate();
    }
    
    public void closeConn() throws SQLException{
        if(ps != null){
            ps.close();
        }
        conn.close();
    }
    
    public ResultSet exReturn(String query) throws SQLException{
        Statement sp = conn.createStatement();
        return sp.executeQuery(query);
    }
}
