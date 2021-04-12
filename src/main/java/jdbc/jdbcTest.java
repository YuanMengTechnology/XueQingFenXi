package jdbc;

import java.sql.*;

public class jdbcTest {
    public static void main(String[] args) {
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //try with resource
        try(Connection c= DriverManager.getConnection("jdbc:oracle:thin:@112.74.190.130:1521:orcl","lzl","lzl1234");
            Statement s=c.createStatement();
        ){
            ResultSet rs=s.executeQuery("select * from a");
            while(rs.next()){
                System.out.println(rs.getDate(1)+"\t"+rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
