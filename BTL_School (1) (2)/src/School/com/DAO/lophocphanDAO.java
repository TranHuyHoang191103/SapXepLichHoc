/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;

import School.com.Modal.PhongdaotaoModal;
import School.com.Modal.lophocphanMODAL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DO BINH
 */
public class lophocphanDAO {
    private ConnectSql conn; 
    public lophocphanDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CourseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<lophocphanMODAL> getList(){
        ArrayList<lophocphanMODAL>ret=new ArrayList<>();
        ResultSet rs=conn.getData("SELECT * FROM lophocphan ");
        if(rs!=null){
            try {
                while(rs.next()){
                    String malophocphan=rs.getString("MaLopHocPhan");
                    String magiangvien=rs.getString("MaGiangVien");
                    String mahocphan=rs.getString("MaHocPhan");
                    int sohocsinh = rs.getInt("SoHocSinh");
                    int nam = rs.getInt("Nam");
                    int ki = rs.getInt("Ki");
                    String tenlop = rs.getString("TenLop");
                    
                    ret.add(new lophocphanMODAL(malophocphan,magiangvien,mahocphan,tenlop,sohocsinh,nam,ki));

                }
            } catch (SQLException ex) {
                Logger.getLogger(lophocphanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ret;
    }
    public int add(lophocphanMODAL lhp) {
        String sql = "INSERT INTO `lophocphan`(`malophocphan`, `magiangvien`, `mahocphan`, `sohocsinh`, `nam`, `ki`, `tenlop`) VALUES ('" 
                     + lhp.getMaLopHocPhan() + "','" + lhp.getMaGiangVien() + "','" + lhp.getMaHocPhan() + "'," + lhp.getSoHocSinh() + "," 
                     + lhp.getNam() + "," + lhp.getKi() + ",'" + lhp.getTenLop() + "')";
        return conn.update(sql);
    }

    public int update(lophocphanMODAL lhp) {
        String sql = "UPDATE `lophocphan` SET `magiangvien` = '" + lhp.getMaGiangVien() + "', `mahocphan` = '" + lhp.getMaHocPhan() + 
                     "', `sohocsinh` = " + lhp.getSoHocSinh() + ", `nam` = " + lhp.getNam() + ", `ki` = " + lhp.getKi() + 
                     ", `tenlop` = '" + lhp.getTenLop() + "' WHERE `malophocphan` = '" + lhp.getMaLopHocPhan() + "'";
        return conn.update(sql);
    }

    public int delete(String maLopHocPhan) {
        String sql = "DELETE FROM `lophocphan` WHERE `malophocphan` = '" + maLopHocPhan + "'";
        return conn.update(sql);
    }
}
