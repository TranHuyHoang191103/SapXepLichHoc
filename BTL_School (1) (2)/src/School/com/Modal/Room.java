/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

/**
 *
 * @author DO BINH
 */
public class Room {
    private String id;
    private String idOfDepartment;
    private boolean isParLab;
    private int numberOfSeat;

    public Room(String id, String idOfDeparment,int numberOfSeat, boolean isParLab) {
        this.id = id;
        this.idOfDepartment=idOfDeparment;
        this.isParLab = isParLab;
        this.numberOfSeat = numberOfSeat;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", idOfDepartment=" + idOfDepartment + ", isParLab=" + isParLab + ", numberOfSeat=" + numberOfSeat + '}';
    }
    
    public String getIdOfDepartment() {
        return idOfDepartment;
    }

    public void setIdOfDepartment(String idOfDepartment) {
        this.idOfDepartment = idOfDepartment;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsParLab() {
        return isParLab;
    }

    public void setIsParLab(boolean isParLab) {
        this.isParLab = isParLab;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }
    
    
}
