/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;


import School.com.Modal.Khoa;
import School.com.Modal.PhongdaotaoModal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO BINH
 */
public class PhongDaoTaoDAO {
    private ConnectSql conn; 
    public PhongDaoTaoDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<PhongdaotaoModal> getList(){
        ArrayList<PhongdaotaoModal>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT * FROM phongdaotao ");
        if(rs!=null){
            try {
                while(rs.next()){
                    String MANV=rs.getString("MaNV");
                    String HOTEN=rs.getString("hoten");
                    ret.add(new PhongdaotaoModal(MANV,HOTEN));
                }
            } catch (SQLException ex) {
                Logger.getLogger(PhongDaoTaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public int add(PhongdaotaoModal t) {
        String sql = "INSERT INTO `phongdaotao`(`MaNV`, `HoTen`) VALUES ('" + t.getMaNV() + "','" + t.getHoten()+ "')";
        return conn.update(sql);
    }

    public int update(PhongdaotaoModal t) {
        String sql = "UPDATE `phongdaotao` SET `HoTen` = '" + t.getHoten()+ "' WHERE `MaNV` = '" + t.getMaNV() + "'";
        return conn.update(sql);
    }

    public int delete(String maNV) {
        String sql = "DELETE FROM `phongdaotao` WHERE `MaNV` = '" + maNV + "'";
        return conn.update(sql);
    }
    
}
