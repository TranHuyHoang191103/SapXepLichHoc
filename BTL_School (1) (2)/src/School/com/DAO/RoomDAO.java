/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;

import School.com.Modal.Khoa;
import School.com.Modal.Room;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84397
 */
public class RoomDAO {
    private ConnectSql conn=null;

    public RoomDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Room> getList(String maKhoa){
        ArrayList<Room>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT * FROM PhongHoc where MaKhoa='"+maKhoa+"'");
        if(rs!=null){
            try {
                while(rs.next()){
                   String maPhongHoc=rs.getString("MaPhongHoc");
                   String maKhoa1=rs.getString("MaKhoa");
                   int soCho=rs.getInt("soCho");
                   boolean loaiPhong = rs.getInt("LoaiPhong") == 1;
                   ret.add(new Room(maPhongHoc,maKhoa1,soCho,loaiPhong));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public ArrayList<Room> getList(){
        ArrayList<Room>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT * FROM PhongHoc");
        if(rs!=null){
            try {
                while(rs.next()){
                   String maPhongHoc=rs.getString("MaPhongHoc");
                   String maKhoa1=rs.getString("MaKhoa");
                   int soCho=rs.getInt("soCho");
                   boolean loaiPhong = rs.getInt("LoaiPhong") == 1;
                   ret.add(new Room(maPhongHoc,maKhoa1,soCho,loaiPhong));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
}
