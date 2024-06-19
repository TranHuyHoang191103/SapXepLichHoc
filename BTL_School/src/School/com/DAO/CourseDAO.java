/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;

import School.com.Modal.Course;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
/**
 *
 * @author 84397
 */
public class CourseDAO {
    private ConnectSql conn=null;

    public CourseDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public HashMap<String,Course> getList(String maKhoa){
        HashMap<String,Course> ret=new HashMap<>();
        ResultSet rs=conn.getData("select *from HocPhan where maKhoa='"+maKhoa+"'");
        if(rs!=null){
            try {
                while(rs.next()){
                    String maHocPhan=rs.getString("MaHocPhan");
                    String tenHocPhan=rs.getString("TenHocPhan");
                    int tinChi=rs.getInt("TinChi");
                    boolean loaiHocPhan=rs.getInt("LoaiHocPhan")==1;
                    ret.put(maHocPhan, new Course(maHocPhan, tenHocPhan, loaiHocPhan, tinChi));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public HashMap<String,Course> getList( ){
        HashMap<String,Course> ret=new HashMap<>();
        ResultSet rs=conn.getData("select *from HocPhan ");
        if(rs!=null){
            try {
                while(rs.next()){
                    String maHocPhan=rs.getString("MaHocPhan");
                    String tenHocPhan=rs.getString("TenHocPhan");
                    int tinChi=rs.getInt("TinChi");
                    boolean loaiHocPhan=rs.getInt("LoaiHocPhan")==1;
                    ret.put(maHocPhan, new Course(maHocPhan, tenHocPhan, loaiHocPhan, tinChi));
                }
            } catch (SQLException ex) {
                Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
}
