/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO BINH
 */
public class ConnectSql {
    private  Connection conn =null;
    
    public ConnectSql() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/BTL-SchoolSchedule";
        String user="root";
        String password="";
        
       try{
           this.conn=DriverManager.getConnection(url,user,password);
       }catch(SQLException ex){
           Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    public  ResultSet getData(String query) {
        ResultSet ret=null;
        Statement st;
        try {
            st=conn.createStatement();
            ret=st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    public  void close(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public  int update(String query){
        int ret=-1;
        Statement st=null;
        try {
            st=conn.createStatement();
            ret=st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectSql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
        
    }
   
}
