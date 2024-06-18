/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.DAO;
import java.sql.ResultSet;
import School.com.Modal.StudySchedule;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 84397
 */
public class StudyScheduleDAO {
    private ConnectSql conn=null;

    public StudyScheduleDAO() {
        try {
            conn=new ConnectSql();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudyScheduleDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudyScheduleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int add(StudySchedule t){
        String query="INSERT INTO `lich`( `MaLopHocPhan`, `MaPhongHoc`, `ThoiGian`, `TietBatDau`, `TietKetThuc`) VALUES('"+t.getMaLopHocPhan()+"','"+t.getMaPhongHoc()+"','"+new java.sql.Date(t.getThoiGian().getTime())+"','"+t.getTietBatDau()+"','"+t.getTietKetThuc()+"')";
        return conn.update(query);
    }
    public ArrayList<StudySchedule> getList(String maKhoa) throws SQLException{
        String query = "SELECT `lich`.`MaLich`, `lich`.`MaLopHocPhan`, `lich`.`MaPhongHoc`, `lich`.`ThoiGian`, `lich`.`TietBatDau`, `lich`.`TietKetThuc` FROM `lich` JOIN `lophocphan` ON `lich`.`MaLopHocPhan` = `lophocphan`.`MaLopHocPhan` JOIN `hocphan` ON `lophocphan`.`MaHocPhan` = `hocphan`.`MaHocPhan` WHERE `hocphan`.`MaKhoa` = '" + maKhoa + "'";
    ResultSet rs = conn.getData(query);
    ArrayList<StudySchedule> lst = new ArrayList<>();
    
    if (rs != null) {
        while (rs.next()) {
            int maLich = rs.getInt("MaLich");
            String maLopHocPhan = rs.getString("MaLopHocPhan");
            String maPhongHoc = rs.getString("MaPhongHoc");
            Date thoiGian = rs.getDate("ThoiGian"); // Assuming ThoiGian is a DATE type in the database
            int tietBatDau = rs.getInt("TietBatDau");
            int tietKetThuc = rs.getInt("TietKetThuc");
            
            StudySchedule schedule = new StudySchedule(maLopHocPhan,maPhongHoc,thoiGian,tietBatDau,tietKetThuc);
            lst.add(schedule);
        }
    }
    
    return lst;
    }
    
}