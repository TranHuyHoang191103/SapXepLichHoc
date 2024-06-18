/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;

import School.com.Modal.Khoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84397
 */
public class KhoaDAO   {
    private ConnectSql conn;
    public KhoaDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Khoa> getList(){
        ArrayList<Khoa>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT * FROM khoa ");
        if(rs!=null){
            try {
                while(rs.next()){
                    String id=rs.getString("MaKhoa");
                    String name=rs.getString("TenKhoa");
                    ret.add(new Khoa(id,name));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public int add(Khoa t){
        String sql="INSERT INTO `khoa`(`MaKhoa`, `TenKhoa`) VALUES ('"+t.getId()+"','"+t.getName()+"')";
        return conn.update(sql);
    }
    public int update(Khoa t){
        String sql ="UPDATE `khoa` SET `TenKhoa` = '" + t.getName() + "' WHERE `MaKhoa` = '" + t.getId() + "'";
        return conn.update(sql);
    }
    public int delete( String makhoa)
    {
        String sql = "DELETE FROM `khoa` WHERE `MaKhoa` = '" + makhoa + "'";
        return conn.update(sql);
    }
    
}
