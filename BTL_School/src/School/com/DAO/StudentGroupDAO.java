/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;


import School.com.Modal.StudentGroup;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84397
 */
public class StudentGroupDAO {
    private ConnectSql conn=null;

    public StudentGroupDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RoomDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<StudentGroup> getList(String maKhoa,int nam,int ki){
        ArrayList<StudentGroup>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT lophocphan.* FROM `lophocphan` JOIN `hocphan` ON lophocphan.MaHocPhan = hocphan.MaHocPhan WHERE hocphan.MaKhoa = '"+maKhoa+"' AND lophocphan.Nam = '"+nam+"' AND lophocphan.Ki = '"+ki+"'");
        if(rs!=null){
            try {
                while(rs.next()){
                   String maLopHoc=rs.getString("MaLopHocPhan");
                   String maHocPhan=rs.getString("MaHocPhan");
                   int soHocSinh=rs.getInt("soHocSinh");
                   String tenLop=rs.getString("TenLop");
                   ret.add(new StudentGroup(maLopHoc, maHocPhan, tenLop,soHocSinh));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public ArrayList<StudentGroup> getList(int nam,int ki){
        ArrayList<StudentGroup>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT lophocphan.* FROM `lophocphan` WHERE  lophocphan.Nam = '"+nam+"' AND lophocphan.Ki = '"+ki+"'");
        if(rs!=null){
            try {
                while(rs.next()){
                   String maLopHoc=rs.getString("MaLopHocPhan");
                   String maHocPhan=rs.getString("MaHocPhan");
                   int soHocSinh=rs.getInt("soHocSinh");
                   String tenLop=rs.getString("TenLop");
                   ret.add(new StudentGroup(maLopHoc, maHocPhan, tenLop,soHocSinh));
                }
            } catch (SQLException ex) {
                Logger.getLogger(AccoutDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }

    public int updateMaGV(String maGV,String maLopHocPhan){
        String query="update lophocphan set maGiangVien='"+maGV+"' where maLopHocPhan='"+maLopHocPhan+"'";
        return conn.update(query);
    }
}
