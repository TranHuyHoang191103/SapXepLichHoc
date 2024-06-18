/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

/**
 *
 * @author DO BINH
 */
public class PhongdaotaoModal {
    private String MaNV,hoten;

    public PhongdaotaoModal(String MaNV, String hoten) {
        this.MaNV = MaNV;
        this.hoten = hoten;
    }
    public PhongdaotaoModal()
    {
    }
 
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Override
    public String toString() {
        return "PhongdaotaoModal{" + "MaNV=" + MaNV + ", hoten=" + hoten + '}';
    }
    
}
