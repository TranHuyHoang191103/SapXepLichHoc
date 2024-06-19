/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

/**
 *
 * @author DO BINH
 */
public class lophocphanMODAL {
    private String MaLopHocPhan,MaGiangVien,MaHocPhan,TenLop;
    private int SoHocSinh,Nam,Ki;

    public lophocphanMODAL(String MaLopHocPhan, String MaGiangVien, String MaHocPhan, String TenLop, int SoHocSinh, int Nam, int Ki) {
        this.MaLopHocPhan = MaLopHocPhan;
        this.MaGiangVien = MaGiangVien;
        this.MaHocPhan = MaHocPhan;
        this.TenLop = TenLop;
        this.SoHocSinh = SoHocSinh;
        this.Nam = Nam;
        this.Ki = Ki;
    }

    
    public lophocphanMODAL()
    {}

    public String getMaLopHocPhan() {
        return MaLopHocPhan;
    }

    public void setMaLopHocPhan(String MaLopHocPhan) {
        this.MaLopHocPhan = MaLopHocPhan;
    }

    public String getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(String MaGiangVien) {
        this.MaGiangVien = MaGiangVien;
    }

    public String getMaHocPhan() {
        return MaHocPhan;
    }

    public void setMaHocPhan(String MaHocPhan) {
        this.MaHocPhan = MaHocPhan;
    }

    public int getSoHocSinh() {
        return SoHocSinh;
    }

    public void setSoHocSinh(int SoHocSinh) {
        this.SoHocSinh = SoHocSinh;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int Nam) {
        this.Nam = Nam;
    }

    public int getKi() {
        return Ki;
    }

    public void setKi(int Ki) {
        this.Ki = Ki;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    @Override
    public String toString() {
        return "lophocphanMODAL{" + "MaLopHocPhan=" + MaLopHocPhan + ", MaGiangVien=" + MaGiangVien + ", MaHocPhan=" + MaHocPhan + ", TenLop=" + TenLop + ", SoHocSinh=" + SoHocSinh + ", Nam=" + Nam + ", Ki=" + Ki + '}';
    }

    
   
    
    
}
