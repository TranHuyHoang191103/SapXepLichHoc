package School.com.DAO;

import School.com.Modal.Teacher;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GiangVienDAO {
    private ConnectSql conn;

    public GiangVienDAO() {
        try {
            conn = new ConnectSql();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Teacher> get() {
        ArrayList<Teacher> lst = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = conn.getData("SELECT * FROM GiangVien");
            if (rs != null) {
                while (rs.next()) {
                    String maGiangVien = rs.getString("MaGiangVien");
                    String maKhoa = rs.getString("MaKhoa");
                    String tenGiangVien = rs.getString("TenGiangVien");
                    String bangCap = rs.getString("BangCap");
                    lst.add(new Teacher(maGiangVien,maKhoa,bangCap,tenGiangVien));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lst;
    }
    public ArrayList<Teacher> get(String maKhoa) {
        ArrayList<Teacher> lst = new ArrayList<>();
        ResultSet rs = null;
        try {
            rs = conn.getData("SELECT * FROM GiangVien where maKhoa='"+maKhoa+"'");
            if (rs != null) {
                while (rs.next()) {
                    String maGiangVien = rs.getString("MaGiangVien");
                    String tenGiangVien = rs.getString("TenGiangVien");
                    String bangCap = rs.getString("BangCap");
                    ArrayList<String>courses=new ArrayList<>();
                    ResultSet rsCourse=conn.getData("select maHocPhan from MonHoc where MaGiangVien='"+maGiangVien+"'");
                    if(rsCourse!=null){
                        while(rsCourse.next()){
                            String maHocPhan =rsCourse.getString("maHocPhan");
                            courses.add(maHocPhan);
                        }
                    }
                    lst.add(new Teacher(maGiangVien,maKhoa,bangCap,tenGiangVien,courses));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return lst;
    }
    public Teacher getInform(String maGV) {
        ResultSet rs = null;
        try {
            rs = conn.getData("SELECT * FROM GiangVien where maGiangVien='"+maGV+"'");
            if (rs != null) {
                while (rs.next()) {
                    String maGiangVien = rs.getString("MaGiangVien");
                    String tenGiangVien = rs.getString("TenGiangVien");
                    String maKhoa=rs.getString("MaKhoa");
                    String bangCap = rs.getString("BangCap");
                    ArrayList<String>courses=new ArrayList<>();
                    ResultSet rsCourse=conn.getData("select maHocPhan from MonHoc where MaGiangVien='"+maGiangVien+"'");
                    if(rsCourse!=null){
                        while(rsCourse.next()){
                            String maHocPhan =rsCourse.getString("maHocPhan");
                            courses.add(maHocPhan);
                        }
                    }
                    return (new Teacher(maGiangVien,maKhoa,bangCap,tenGiangVien,courses));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return null;
    }
    public int add(Teacher t) {
        String sql = "INSERT INTO `giangvien`(`MaGiangVien`, `MaKhoa`, `TenGiangVien`, `BangCap`) VALUES ('" + t.getId()+ "','" + t.getIdOfDepartment()+ "','" + t.getName()+ "','" + t.getDegree()+ "')";
        return conn.update(sql);
    }
    public int update(Teacher t) {
        String sql = "UPDATE `giangvien` SET `MaKhoa` = '" + t.getIdOfDepartment() + "', `TenGiangVien` = '" + t.getName() + "', `BangCap` = '" + t.getDegree() + "' WHERE `MaGiangVien` = '" + t.getId() + "'";
        return conn.update(sql);
    }

    public int delete(String maGiangVien) {
        String sql = "DELETE FROM `giangvien` WHERE `MaGiangVien` = '" + maGiangVien + "'";
        return conn.update(sql);
    }
    public int updateCourse(String maGiangVien,String maHocPhan){
        String sql="update MonHoc set MaHocPhan='"+maHocPhan+"' where MaGiangVien='"+maGiangVien+"'";
        return conn.update(sql);
    }
    public int addCourse(String maGiangVien,String maHocPhan){
        String sql="INSERT INTO `monhoc`(`MaGiangVien`, `MaHocPhan`) VALUES ('"+maGiangVien+"','"+maHocPhan+"')";
        return conn.update(sql);
    }
}
