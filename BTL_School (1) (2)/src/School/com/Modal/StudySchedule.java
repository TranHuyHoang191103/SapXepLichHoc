/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

import java.util.Date;

/**
 *
 * @author 84397
 */
public class StudySchedule {
    private String maLich,maLopHocPhan,maPhongHoc;
    private Date thoiGian;
    private int tietBatDau,tietKetThuc;

    public StudySchedule( String maLopHocPhan, String maPhongHoc, Date thoiGian, int tietBatDau, int tietKetThuc) {
        this.maLopHocPhan = maLopHocPhan;
        this.maPhongHoc = maPhongHoc;
        this.thoiGian = thoiGian;
        this.tietBatDau = tietBatDau;
        this.tietKetThuc = tietKetThuc;
    }
    public StudySchedule( String maLopHocPhan, String maPhongHoc, int tietBatDau, int tietKetThuc) {
        this.maLopHocPhan = maLopHocPhan;
        this.maPhongHoc = maPhongHoc;
        this.tietBatDau = tietBatDau;
        this.tietKetThuc = tietKetThuc;
    }
    public String getMaLich() {
        return maLich;
    }

    public void setMaLich(String maLich) {
        this.maLich = maLich;
    }

    public String getMaLopHocPhan() {
        return maLopHocPhan;
    }

    public void setMaLopHocPhan(String maLopHocPhan) {
        this.maLopHocPhan = maLopHocPhan;
    }

    public String getMaPhongHoc() {
        return maPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        this.maPhongHoc = maPhongHoc;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getTietBatDau() {
        return tietBatDau;
    }

    public void setTietBatDau(int tietBatDau) {
        this.tietBatDau = tietBatDau;
    }

    public int getTietKetThuc() {
        return tietKetThuc;
    }

    public void setTietKetThuc(int tietKetThuc) {
        this.tietKetThuc = tietKetThuc;
    }
    
}
