/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.com.Modal;

/**
 *
 * @author 84397
 */
public class Khoa {
    private String id,name;

    public Khoa(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Khoa(){
        this.id="";
        this.name="";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
