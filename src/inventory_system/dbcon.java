package inventory_system;
import java.sql.*;



public class dbcon {
    static Connection con;
    static Statement stat=null;
    public static Statement getConnection(){
        try {
           String url="jdbc:mysql://localhost:3306/erp";
            con = DriverManager.getConnection(url,"root","");
            stat = con.createStatement();
        } catch (SQLException e) {
            System.out.println("Failed "+e.toString());
        }
        return stat;
    }
    public static void closeCon() throws SQLException {
        con.close();
    }
    public static void main (String[]args){
        getConnection();
        
    }
}
